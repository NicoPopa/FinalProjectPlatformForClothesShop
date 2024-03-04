package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Accessory {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    public String name;
    public String model;
    public int quantity;
}
