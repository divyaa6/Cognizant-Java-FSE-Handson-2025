package com.cognizant.springlearn.jwt_auth_service.controller;

import com.cognizant.springlearn.jwt_auth_service.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
        // Decode Basic Auth header
        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded, StandardCharsets.UTF_8);
            String[] values = credentials.split(":", 2);

            String username = values[0];
            String password = values[1];

            // For demo: match hardcoded username/password
            if ("user".equals(username) && "pwd".equals(password)) {
                String token = jwtUtil.generateToken(username);
                return ResponseEntity.ok().body(new TokenResponse(token));
            } else {
                return ResponseEntity.status(401).body("Invalid credentials");
            }
        }

        return ResponseEntity.status(400).body("Missing Authorization header");
    }

    // Token response wrapper
    static class TokenResponse {
        public String token;
        public TokenResponse(String token) {
            this.token = token;
        }
        public String getToken() {
            return token;
        }
    }
}
