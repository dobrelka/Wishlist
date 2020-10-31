package com.raywenderlich.android.wishlist.persistence

import java.util.*
import java.util.concurrent.ThreadLocalRandom

object WishlistFactory {
  private fun makeRandomString() = UUID.randomUUID().toString()

  private fun makeRandomInt() = ThreadLocalRandom.current().nextInt(0, 1000 + 1)
}