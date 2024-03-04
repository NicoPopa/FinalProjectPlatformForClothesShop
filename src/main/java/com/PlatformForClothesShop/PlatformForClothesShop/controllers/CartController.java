package com.PlatformForClothesShop.PlatformForClothesShop.controllers;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddCartDto;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Cart;
import com.PlatformForClothesShop.PlatformForClothesShop.services.CartService;
import com.PlatformForClothesShop.PlatformForClothesShop.services.DiscountService;
import com.PlatformForClothesShop.PlatformForClothesShop.services.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    private final CartService cartService;
    private final ItemService itemService;
    private final DiscountService discountService;

    public CartController(CartService cartService, ItemService itemService, DiscountService discountService) {
        this.cartService = cartService;
        this.itemService = itemService;
        this.discountService = discountService;
    }

    @PostMapping("/cart/add")
    public void addToCart(@RequestBody AddCartDto body) {
        Cart cartItemToAdd = new Cart();
        cartItemToAdd.setCartId(body.cartId);
        cartItemToAdd.setItemId(itemService.itemRepository.getReferenceById(body.itemId));
        cartItemToAdd.setDiscount(discountService.discountRepository.getReferenceById(body.discountId));
        cartService.addToCart(cartItemToAdd);
    }

    @GetMapping("/cart/find")
    public String getCartItems() {
        int cartItems = cartService.getCartItems().size();
        if ( cartItems == 0 ){
            return "Cosul de cumparaturi este gol";
        }
        else{
            return "In cos se afla " +cartItems + " produse";
        }

    }
}
