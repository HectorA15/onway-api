package com.OnWay.api.repository;

import com.OnWay.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Spring Data JPA generates implementation automatically
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}