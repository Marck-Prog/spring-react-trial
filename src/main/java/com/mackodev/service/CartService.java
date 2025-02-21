package com.mackodev.service;

import com.mackodev.modal.Cart;
import com.mackodev.modal.CartItem;
import com.mackodev.modal.Product;
import com.mackodev.modal.User;

public interface CartService {

    public CartItem addCartItem(
            User user,
            Product product,
            String size,
            int quantity
    );

    public Cart findUserCart(User user);
}
