package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;
    public Long productId;

    ///categoryID 1 = accessory
    ///categoryID 2 = clothing
    ///categoryID 3 = shoe
    public Long categoryId;

}
