package com.mackodev.service;

import com.mackodev.domain.USER_ROLE;
import com.mackodev.request.LoginRequest;
import com.mackodev.response.AuthResponse;
import com.mackodev.response.SignupRequest;

public interface AuthService {

    void sentLoginOtp(String email, USER_ROLE role) throws Exception;
    String createUser(SignupRequest req) throws Exception;
    AuthResponse signing(LoginRequest req) throws Exception;
}
