package com.PlatformForClothesShop.PlatformForClothesShop.repositories;

import com.PlatformForClothesShop.PlatformForClothesShop.entities.Cart;
import com.PlatformForClothesShop.PlatformForClothesShop.entities.ShopUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    List<Cart> findByCartId(Long cartId);
}
