package com.raywenderlich.android.wishlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/raywenderlich/android/wishlist/WishlistDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "Lcom/raywenderlich/android/wishlist/DetailViewModel;", "getViewModel", "()Lcom/raywenderlich/android/wishlist/DetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "wishlistAdapter", "Lcom/raywenderlich/android/wishlist/WishItemAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "render", "wishlist", "Lcom/raywenderlich/android/wishlist/Wishlist;", "showAddListInput", "Companion", "app_release"})
public final class WishlistDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.raywenderlich.android.wishlist.WishItemAdapter wishlistAdapter = null;
    private static final java.lang.String EXTRA_WISHLIST = "EXTRA_WISHLIST";
    public static final com.raywenderlich.android.wishlist.WishlistDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.raywenderlich.android.wishlist.DetailViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void render(com.raywenderlich.android.wishlist.Wishlist wishlist) {
    }
    
    private final void showAddListInput(com.raywenderlich.android.wishlist.Wishlist wishlist) {
    }
    
    public WishlistDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/wishlist/WishlistDetailActivity$Companion;", "", "()V", "EXTRA_WISHLIST", "", "newIntent", "Landroid/content/Intent;", "wishlist", "Lcom/raywenderlich/android/wishlist/Wishlist;", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.wishlist.Wishlist wishlist, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}