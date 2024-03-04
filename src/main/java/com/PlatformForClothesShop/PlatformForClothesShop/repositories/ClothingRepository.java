package com.PlatformForClothesShop.PlatformForClothesShop.repositories;

import com.PlatformForClothesShop.PlatformForClothesShop.entities.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothingRepository extends JpaRepository<Clothing, Long> {
}
