package com.mackodev.repository;

import com.mackodev.modal.Cart;
import com.mackodev.modal.CartItem;
import com.mackodev.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);
}
