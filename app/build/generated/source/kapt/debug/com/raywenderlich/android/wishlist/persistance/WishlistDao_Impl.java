package com.raywenderlich.android.wishlist.persistance;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.raywenderlich.android.wishlist.Wishlist;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WishlistDao_Impl implements WishlistDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfWishlist;

  public WishlistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWishlist = new EntityInsertionAdapter<Wishlist>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Wishlist`(`receiver`,`wishes`,`id`) VALUES (?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Wishlist value) {
        if (value.getReceiver() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getReceiver());
        }
        final String _tmp;
        _tmp = StringListConverter.stringListToString(value.getWishes());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        stmt.bindLong(3, value.getId());
      }
    };
  }

  @Override
  public void save(final Wishlist... wishlist) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWishlist.insert(wishlist);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Wishlist>> getAll() {
    final String _sql = "SELECT * FROM wishlist";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"wishlist"}, false, new Callable<List<Wishlist>>() {
      @Override
      public List<Wishlist> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfReceiver = CursorUtil.getColumnIndexOrThrow(_cursor, "receiver");
          final int _cursorIndexOfWishes = CursorUtil.getColumnIndexOrThrow(_cursor, "wishes");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Wishlist> _result = new ArrayList<Wishlist>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Wishlist _item;
            final String _tmpReceiver;
            _tmpReceiver = _cursor.getString(_cursorIndexOfReceiver);
            final List<String> _tmpWishes;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfWishes);
            _tmpWishes = StringListConverter.stringTostringList(_tmp);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item = new Wishlist(_tmpReceiver,_tmpWishes,_tmpId);
            _result.add(_item);
          }
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

  @Override
  public LiveData<Wishlist> findById(final int id) {
    final String _sql = "SELECT * FROM wishlist WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"wishlist"}, false, new Callable<Wishlist>() {
      @Override
      public Wishlist call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfReceiver = CursorUtil.getColumnIndexOrThrow(_cursor, "receiver");
          final int _cursorIndexOfWishes = CursorUtil.getColumnIndexOrThrow(_cursor, "wishes");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final Wishlist _result;
          if(_cursor.moveToFirst()) {
            final String _tmpReceiver;
            _tmpReceiver = _cursor.getString(_cursorIndexOfReceiver);
            final List<String> _tmpWishes;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfWishes);
            _tmpWishes = StringListConverter.stringTostringList(_tmp);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result = new Wishlist(_tmpReceiver,_tmpWishes,_tmpId);
          } else {
            _result = null;
          }
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
