package com.raywenderlich.android.wishlist.persistence

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.raywenderlich.android.wishlist.Wishlist
import com.raywenderlich.android.wishlist.persistance.WishlistDao
import com.raywenderlich.android.wishlist.persistance.WishlistDatabase
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*

@RunWith(AndroidJUnit4::class)
class WishlistDaoTest {

  @get:Rule
  var instantTaskExecutorRule = InstantTaskExecutorRule()

  private lateinit var wishlistDatabase: WishlistDatabase
  private lateinit var wishlistDao: WishlistDao

  @Before
  fun initDb() {
    wishlistDatabase = Room.inMemoryDatabaseBuilder(
        InstrumentationRegistry.getInstrumentation().context,
        WishlistDatabase::class.java).build()

    wishlistDao = wishlistDatabase.wishlistDao()

  }

  @After
  fun closeDb() {
    wishlistDatabase.close()
  }

  @Test
  fun getAllReturnsEmptyList() {
    val testObserver: Observer<List<Wishlist>> = mock()
    wishlistDao.getAll().observeForever(testObserver)
    verify(testObserver).onChanged(emptyList())

  }

}