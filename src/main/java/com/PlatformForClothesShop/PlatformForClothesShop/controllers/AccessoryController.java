package com.PlatformForClothesShop.PlatformForClothesShop.controllers;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddAccessoryDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Accessory;
import com.PlatformForClothesShop.PlatformForClothesShop.services.AccessoryService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccessoryController {
    private final AccessoryService accessoryService;

    public AccessoryController(AccessoryService accessoryService) {
        this.accessoryService = accessoryService;
    }
    @PostMapping("/accessory/add")
    public Accessory addNewAccessory(@RequestBody AddAccessoryDTO body)
    {return accessoryService.add(body);}

    @DeleteMapping("/accessory/delete")
    public void deleteAccessory(@RequestParam Long id){
       accessoryService.delete(id);
    }
    @GetMapping("/accessory/all")
    public String getAllAccessory(){
         int accessoryCount = accessoryService.getAllAccesory().size();
         if (accessoryCount == 0){
            return "Nu mai sunt produse in stoc";
         } else{
            return "In stoc se afla " + accessoryCount + " accesorii";
         }
    }


}
