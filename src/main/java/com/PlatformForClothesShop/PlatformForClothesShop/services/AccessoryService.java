package com.PlatformForClothesShop.PlatformForClothesShop.services;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddAccessoryDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Accessory;
import com.PlatformForClothesShop.PlatformForClothesShop.repositories.AccessoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessoryService {
    public AccessoryRepository accessoryRepository;

    public AccessoryService(AccessoryRepository accessoryRepository) {
        this.accessoryRepository = accessoryRepository;
    }

    public Accessory add(AddAccessoryDTO body) {
        Accessory accessory = new Accessory();
        accessory.setName(body.name);
        accessory.setModel(body.model);
        accessory.setQuantity(body.quantity);

       return accessoryRepository.save(accessory);
    }
    public void delete(Long id) {
        accessoryRepository.deleteById(id);
    }
    public List<Accessory>getAllAccesory(){
        return accessoryRepository.findAll();
    }


}
