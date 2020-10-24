package com.raywenderlich.android.wishlist.persistance;

import androidx.room.RoomDatabase;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WishlistDao_Impl implements WishlistDao {
  private final RoomDatabase __db;

  public WishlistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }
}
