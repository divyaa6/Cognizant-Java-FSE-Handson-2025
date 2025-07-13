package com.cognizant.springlearn.jwt_auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredController {

    @GetMapping("/secured")
    public String secured() {
        return "✅ Access granted to secured endpoint!";
    }
}
