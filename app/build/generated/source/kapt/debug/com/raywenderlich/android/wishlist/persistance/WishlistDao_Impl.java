package com.raywenderlich.android.wishlist.persistance;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import com.raywenderlich.android.wishlist.Wishlist;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WishlistDao_Impl implements WishlistDao {
  private final RoomDatabase __db;

  public WishlistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public LiveData<List<Wishlist>> getAll() {
    final String _sql = "";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{}, false, new Callable<List<Wishlist>>() {
      @Override
      public List<Wishlist> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
