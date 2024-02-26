package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accessory {
    @Id
    public String name;
    public String model;
    public int quantity;
}
