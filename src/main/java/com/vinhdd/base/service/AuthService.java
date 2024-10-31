package com.vinhdd.base.service;

import com.vinhdd.base.dto.out.AuthResponse;

public interface AuthService {
    AuthResponse login(String username, String password);
    void register(String username, String password);
}
