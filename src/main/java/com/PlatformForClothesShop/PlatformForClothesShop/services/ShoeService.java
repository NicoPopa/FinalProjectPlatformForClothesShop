package com.PlatformForClothesShop.PlatformForClothesShop.services;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddShoeDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Shoe;
import com.PlatformForClothesShop.PlatformForClothesShop.repositories.ShoeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoeService {
    public ShoeRepository shoeRepository;

    public ShoeService(ShoeRepository shoeRepository) {
        this.shoeRepository = shoeRepository;
    }

    public void add(AddShoeDTO body){
        Shoe shoeToAdd = new Shoe();
        shoeToAdd.setPrice(body.price);
        shoeToAdd.setPrice(body.price);
        shoeToAdd.setQuantity(body.quantity);
        shoeRepository.save(shoeToAdd);
    }
    public List<Shoe> getAllShoe(){
        return shoeRepository.findAll();
    }
}
