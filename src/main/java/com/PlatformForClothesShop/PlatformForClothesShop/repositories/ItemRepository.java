package com.PlatformForClothesShop.PlatformForClothesShop.repositories;

import com.PlatformForClothesShop.PlatformForClothesShop.entities.Accessory;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
