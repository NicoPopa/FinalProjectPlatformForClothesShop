package com.PlatformForClothesShop.PlatformForClothesShop.services;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddClothingDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddItemDto;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Clothing;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Item;
import com.PlatformForClothesShop.PlatformForClothesShop.repositories.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void add(AddItemDto body){
        Item itemToAdd = new Item();
        itemToAdd.setCategoryId(body.itemCategory);
        itemToAdd.setProductId(body.itemCategory);
        itemRepository.save(itemToAdd);
    }
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
}
