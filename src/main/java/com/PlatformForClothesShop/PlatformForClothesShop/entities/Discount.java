package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Discount {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;
    public String discountName;
    public int amount;


}
