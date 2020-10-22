package com.raywenderlich.android.wishlist.persistance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H&\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/android/wishlist/persistance/Repository;", "", "getWishlist", "Landroidx/lifecycle/LiveData;", "Lcom/raywenderlich/android/wishlist/Wishlist;", "id", "", "getWishlists", "", "saveWishlist", "", "wishlist", "saveWishlistItem", "app_release"})
public abstract interface Repository {
    
    public abstract void saveWishlist(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.wishlist.Wishlist wishlist);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.android.wishlist.Wishlist>> getWishlists();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.raywenderlich.android.wishlist.Wishlist> getWishlist(int id);
    
    public abstract void saveWishlistItem(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.wishlist.Wishlist wishlist);
}