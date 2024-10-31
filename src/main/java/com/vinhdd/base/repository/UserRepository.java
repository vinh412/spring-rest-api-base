package com.vinhdd.base.repository;

import com.vinhdd.base.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    public User findByUsername(String username);
}
