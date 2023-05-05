package com.example.sportshop;


import com.example.sportshop.models.User;
import com.example.sportshop.models.enums.Role;
import com.example.sportshop.repositories.UserRepository;
import com.example.sportshop.services.CustomUserDetailsService;
import com.example.sportshop.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class CustomUserDetailsServiceTest {

    private UserService userService;
    private CustomUserDetailsService customUserDetailsService;
    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        customUserDetailsService = new CustomUserDetailsService(userRepository);
    }

    @Test
    void testLoadUserByUsername() {
        String email = "test@test.com";
        User user = new User();
        user.setEmail(email);
        user.setPassword("password");
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.ROLE_USER));
        when(userRepository.findByEmail(email)).thenReturn(user);
        UserDetails userDetails = customUserDetailsService.loadUserByUsername(email);
        assertEquals(user.getEmail(), userDetails.getUsername());
        assertEquals(user.getPassword(), userDetails.getPassword());
        assertTrue(userDetails.isEnabled());
        assertEquals(user.getRoles(), userDetails.getAuthorities());
    }
}