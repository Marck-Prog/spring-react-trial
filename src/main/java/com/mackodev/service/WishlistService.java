package com.mackodev.service;

import com.mackodev.modal.Product;
import com.mackodev.modal.User;
import com.mackodev.modal.Wishlist;

public interface WishlistService {
    Wishlist createWishlist(User user);
    Wishlist getWishlistByUserId(User user);
    Wishlist addProductToWishlist(User user, Product product);
}
