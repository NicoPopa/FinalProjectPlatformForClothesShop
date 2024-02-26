package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {
    @Id
    public Long id;
    public Long cartId;
    public Long itemId;
    public Long categoryId;
}
