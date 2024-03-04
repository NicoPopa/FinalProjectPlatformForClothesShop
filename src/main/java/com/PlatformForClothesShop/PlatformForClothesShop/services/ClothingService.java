package com.PlatformForClothesShop.PlatformForClothesShop.services;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddClothingDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Clothing;
import com.PlatformForClothesShop.PlatformForClothesShop.repositories.ClothingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothingService {
    public ClothingRepository clothingRepository;

    public ClothingService(ClothingRepository clothingRepository) {
        this.clothingRepository = clothingRepository;
    }

    public void add(AddClothingDTO body){
        Clothing clothingToAdd = new Clothing();
        clothingToAdd.setName(body.name);
        clothingToAdd.setPrice(body.price);
        clothingToAdd.setQuantity(body.quantity);
        clothingRepository.save(clothingToAdd);
    }
    public List<Clothing> getAllClothing(){
        return clothingRepository.findAll();
    }
}
