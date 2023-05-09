package com.example.sportshop.DAO.repositories;

import com.example.sportshop.DAO.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
