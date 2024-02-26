package com.PlatformForClothesShop.PlatformForClothesShop.repositories;

import com.PlatformForClothesShop.PlatformForClothesShop.entities.ShopUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<ShopUser, Long> {

    List<ShopUser> findByName(String nameUser);
}
