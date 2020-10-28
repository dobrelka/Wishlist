package com.raywenderlich.android.wishlist.persistence

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class WishlistDaoTest {

  @get:Rule
  var instantTaskExecutorRule = InstantTaskExecutorRule()
}