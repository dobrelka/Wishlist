package com.raywenderlich.android.wishlist

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import com.raywenderlich.android.wishlist.persistance.RepositoryImpl
import com.raywenderlich.android.wishlist.persistance.WishlistDao
import com.raywenderlich.android.wishlist.persistance.WishlistDatabase
import org.junit.Rule
import org.mockito.Mockito

class DetailViewModelTest {

  @get:Rule
  var instantTaskExecutorRule = InstantTaskExecutorRule()

  private val wishlistDao: WishlistDao = Mockito.spy(
      Room.inMemoryDatabaseBuilder(
      InstrumentationRegistry.getInstrumentation().context,
      WishlistDatabase::class.java).build().wishlistDao())

  private val viewModel = DetailViewModel(
      RepositoryImpl(wishlistDao) )

}