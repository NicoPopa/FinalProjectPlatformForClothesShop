package com.PlatformForClothesShop.PlatformForClothesShop.controllers;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddUserDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.ShopUser;
import org.springframework.web.bind.annotation.*;
import com.PlatformForClothesShop.PlatformForClothesShop.services.UserService;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user/add")
    public void addNewUser(@RequestBody AddUserDTO body){
        userService.add(body);
    }
    @DeleteMapping("/user/delete")
    public void deleteUser(@RequestParam Long id){
        userService.delete(id);
    }

    @GetMapping("user/all")
    public List<ShopUser> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("user/update")
    public void updateUser(@RequestBody ShopUser userToBeUpdated){
        userService.updateUser(userToBeUpdated);
    }
}
