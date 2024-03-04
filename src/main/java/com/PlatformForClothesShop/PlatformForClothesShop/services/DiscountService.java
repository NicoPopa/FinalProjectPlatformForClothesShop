package com.PlatformForClothesShop.PlatformForClothesShop.services;

import com.PlatformForClothesShop.PlatformForClothesShop.entities.Cart;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Discount;
import com.PlatformForClothesShop.PlatformForClothesShop.repositories.DiscountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {

    public DiscountRepository discountRepository;

    public DiscountService(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }
    public void add (Discount discountToAdd) {
    discountRepository.save(discountToAdd);
    }

    public List<Discount> getDiscounts() {
        return discountRepository.findAll();
    }
}



