package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Clothing {
    @Id
    Long clothingID;
    private String name;
    private double price;
    private int quantity;


        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

    }
