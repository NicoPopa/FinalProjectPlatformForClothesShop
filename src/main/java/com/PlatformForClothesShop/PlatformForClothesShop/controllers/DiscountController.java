package com.PlatformForClothesShop.PlatformForClothesShop.controllers;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddCartDto;
import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddDiscountDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Cart;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Discount;
import com.PlatformForClothesShop.PlatformForClothesShop.services.DiscountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiscountController {
    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @PostMapping("/discount/add")
    public void addToCart(@RequestBody AddDiscountDTO body) {
        Discount discountToAdd = new Discount();
        discountToAdd.setDiscountName(body.discountName);
        discountToAdd.setAmount(body.amount);

        discountService.add(discountToAdd);
    }
    @GetMapping("/discount/find")
    public List<Discount> getDiscount() {
        return discountService.getDiscounts();}
}
