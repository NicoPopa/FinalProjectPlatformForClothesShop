package com.PlatformForClothesShop.PlatformForClothesShop.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;
    public Long cartId;

    @OneToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "item_id")
    public Item itemId;


    @OneToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "discount_id")
    public Discount discount;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public ShopUser userId;

}
