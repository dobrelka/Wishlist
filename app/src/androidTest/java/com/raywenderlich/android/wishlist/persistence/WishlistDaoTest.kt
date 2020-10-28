package com.raywenderlich.android.wishlist.persistence

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.raywenderlich.android.wishlist.persistance.WishlistDao
import com.raywenderlich.android.wishlist.persistance.WishlistDatabase
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith

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

}