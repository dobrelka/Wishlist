package com.raywenderlich.android.wishlist.persistance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/raywenderlich/android/wishlist/persistance/RepositoryImpl;", "Lcom/raywenderlich/android/wishlist/persistance/Repository;", "wishlistDao", "Lcom/raywenderlich/android/wishlist/persistance/WishlistDao;", "(Lcom/raywenderlich/android/wishlist/persistance/WishlistDao;)V", "getWishlistDao", "()Lcom/raywenderlich/android/wishlist/persistance/WishlistDao;", "getWishlist", "Landroidx/lifecycle/LiveData;", "Lcom/raywenderlich/android/wishlist/Wishlist;", "id", "", "getWishlists", "", "saveWishlist", "", "wishlist", "saveWishlistItem", "app_release"})
public final class RepositoryImpl implements com.raywenderlich.android.wishlist.persistance.Repository {
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.wishlist.persistance.WishlistDao wishlistDao = null;
    
    @java.lang.Override()
    public void saveWishlist(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.wishlist.Wishlist wishlist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.android.wishlist.Wishlist>> getWishlists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.raywenderlich.android.wishlist.Wishlist> getWishlist(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void saveWishlistItem(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.wishlist.Wishlist wishlist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.wishlist.persistance.WishlistDao getWishlistDao() {
        return null;
    }
    
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.wishlist.persistance.WishlistDao wishlistDao) {
        super();
    }
}