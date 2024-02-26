package com.PlatformForClothesShop.PlatformForClothesShop.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.PlatformForClothesShop.PlatformForClothesShop.services.ClothingService;

@RestController
public class ClothingController {
    private final ClothingService clothingService;

    public ClothingController(ClothingService clothingService) {
        this.clothingService = clothingService;
    }
}
