package com.raywenderlich.android.wishlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/raywenderlich/android/wishlist/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/android/wishlist/persistance/Repository;", "(Lcom/raywenderlich/android/wishlist/persistance/Repository;)V", "getWishlist", "Landroidx/lifecycle/LiveData;", "Lcom/raywenderlich/android/wishlist/Wishlist;", "id", "", "saveNewItem", "", "wishlist", "name", "", "app_release"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.raywenderlich.android.wishlist.persistance.Repository repository = null;
    
    public final void saveNewItem(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.wishlist.Wishlist wishlist, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.raywenderlich.android.wishlist.Wishlist> getWishlist(int id) {
        return null;
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.wishlist.persistance.Repository repository) {
        super();
    }
}