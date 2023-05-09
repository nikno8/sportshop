package com.example.sportshop.DAO.repositories;

import com.example.sportshop.DAO.models.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Long> {
    Basket findByProductId(Long productId);
}
