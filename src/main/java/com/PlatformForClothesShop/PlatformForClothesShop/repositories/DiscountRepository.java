package com.PlatformForClothesShop.PlatformForClothesShop.repositories;

import com.PlatformForClothesShop.PlatformForClothesShop.entities.Cart;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountRepository extends JpaRepository < Discount, Long> {
//    List<Discount> findById(Long discountID);
}
