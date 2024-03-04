package com.PlatformForClothesShop.PlatformForClothesShop.services;

import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddUserDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.ShopUser;
import org.springframework.stereotype.Service;
import com.PlatformForClothesShop.PlatformForClothesShop.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    public UserRepository userRepository;
    public UserService (UserRepository userRepository){ this.userRepository = userRepository;};

    public List <ShopUser> getUserByName(String nameUser){
        return userRepository.findByName(nameUser);
    }
    public void add(AddUserDTO body){
        ShopUser shopUserToAdd = new ShopUser();
        shopUserToAdd.setName(body.name);
        shopUserToAdd.setUserEmail(body.userEmail);
        shopUserToAdd.setPassword(body.password);
        userRepository.save(shopUserToAdd);
    }
    public void delete(Long id){
        userRepository.deleteById(id);
    }
    public List<ShopUser> getAllUser(){
        return userRepository.findAll();
    }
    public void updateUser(ShopUser userToBeUpdated){
        userRepository.save(userToBeUpdated);
    }

}
