package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Clothing {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long clothingID;
    private String name;
    private double price;
    private int quantity;
    }
