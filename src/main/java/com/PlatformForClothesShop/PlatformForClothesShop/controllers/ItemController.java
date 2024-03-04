package com.PlatformForClothesShop.PlatformForClothesShop.controllers;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddClothingDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddItemDto;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Clothing;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Item;
import com.PlatformForClothesShop.PlatformForClothesShop.services.ClothingService;
import com.PlatformForClothesShop.PlatformForClothesShop.services.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/item/add")
    public void addNewItem(@RequestBody AddItemDto body){
        itemService.add(body);
    }
    @GetMapping("/item/all")
    public List<Item> getAllClothing(){
        return itemService.getAllItems();
    }

}
