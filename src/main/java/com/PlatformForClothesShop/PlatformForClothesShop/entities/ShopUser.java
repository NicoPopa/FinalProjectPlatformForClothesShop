package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShopUser {
    @Id
    public Long userID;
    public String name;
    public String userEmail;
    public String password;
}
