package com.example.sportshop.DAO.repositories;

import com.example.sportshop.DAO.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
