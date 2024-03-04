package com.PlatformForClothesShop.PlatformForClothesShop.controllers;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddShoeDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Shoe;
import com.PlatformForClothesShop.PlatformForClothesShop.services.ShoeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoeController {
    private final ShoeService shoeService;

    public ShoeController(ShoeService shoeService) {
        this.shoeService = shoeService;
    }
    @PostMapping("/shoe/add")
    public void addNewShoe(@RequestBody AddShoeDTO body){
        shoeService.add(body);
    }

    @GetMapping("/shoe/all")
    public String getAllShoe() {
       int shoeCount = shoeService.getAllShoe().size();
       if( shoeCount == 0){
           return "Nu mai sunt produse in stoc";
       }
       else {
           return "In stroc se afla " + shoeCount + " produse";
       }
    }

}
