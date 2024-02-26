package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shoe {
    @Id
    private int size;
    private double price;

}
