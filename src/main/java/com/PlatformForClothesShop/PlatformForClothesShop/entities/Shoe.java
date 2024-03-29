package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Shoe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int size;
    public double price;
    public int quantity;

}
