package com.raywenderlich.android.wishlist

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.raywenderlich.android.wishlist.persistance.RepositoryImpl
import com.raywenderlich.android.wishlist.persistance.WishlistDao
import com.raywenderlich.android.wishlist.persistance.WishlistDatabase
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class DetailViewModelTest {

  @get:Rule
  var instantTaskExecutorRule = InstantTaskExecutorRule()

  private val wishlistDao: WishlistDao = Mockito.spy(
      Room.inMemoryDatabaseBuilder(
      InstrumentationRegistry.getInstrumentation().context,
      WishlistDatabase::class.java)
          .allowMainThreadQueries()
          .build().wishlistDao())

  private val viewModel = DetailViewModel(
      RepositoryImpl(wishlistDao) )

  @Test
  fun saveNewItemCallsDatabase() {
    viewModel.saveNewItem(Wishlist("Victoria", listOf("RW Android Apprentice Book", "Android phone"), 1),
        "Smart watch")

    verify(wishlistDao).save(any())
  }

  @Test
  fun saveNewItemSavesData() {
    val wishlist = Wishlist("Victoria", listOf("RW Android Apprentice Book", "Android phone"), 1)

    val name = "Smart watch"
    viewModel.saveNewItem(wishlist, name)

    val mockObserver = mock<Observer<Wishlist>>()

    wishlistDao.findById(wishlist.id)
            .observeForever(mockObserver)
    verify(mockObserver).onChanged(
            wishlist.copy(wishes = wishlist.wishes + name))

  }
  @Test
  fun getWishListCallsDatabase() {
    viewModel.getWishlist(1)

    verify(wishlistDao).findById(any())
  }

}