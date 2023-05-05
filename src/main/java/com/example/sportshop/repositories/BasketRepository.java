package com.example.sportshop.repositories;

import com.example.sportshop.models.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Long> {
    Basket findByProductId(Long productId);
}
