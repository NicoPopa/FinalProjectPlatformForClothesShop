package com.PlatformForClothesShop.PlatformForClothesShop.services;

import com.PlatformForClothesShop.PlatformForClothesShop.entities.Cart;
import com.PlatformForClothesShop.PlatformForClothesShop.repositories.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    public CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addToCart(Cart cartItem) {
        cartRepository.save(cartItem);
    }

    public List<Cart> getCartItems() {
        return cartRepository.findAll();
    }
}
