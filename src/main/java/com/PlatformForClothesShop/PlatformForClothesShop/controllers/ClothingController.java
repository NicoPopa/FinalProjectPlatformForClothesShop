package com.PlatformForClothesShop.PlatformForClothesShop.controllers;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddClothingDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Clothing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.PlatformForClothesShop.PlatformForClothesShop.services.ClothingService;

import java.util.List;

@RestController
public class ClothingController {
    private final ClothingService clothingService;

    public ClothingController(ClothingService clothingService) {
        this.clothingService = clothingService;
    }
    @PostMapping("/clothing/add")
    public void addNewClothing(@RequestBody AddClothingDTO body){
        clothingService.add(body);
    }
    @GetMapping("/clothing/all")
    public String getAllClothing(){
        int clothingCount = clothingService.getAllClothing().size();
        if (clothingCount == 0){
            return "Nu mai exista produse in stoc";
        }
        else {
            return "In stoc se afla " +clothingCount + " produse";
        }
    }
}
