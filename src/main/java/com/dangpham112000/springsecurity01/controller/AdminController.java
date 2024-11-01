package com.dangpham112000.springsecurity01.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/admin/")
public class AdminController {

    @RolesAllowed("ADMIN")
    @GetMapping("/vip")
    public String zoneVIP() {
        return "zoneVIP";
    }

    @RolesAllowed({"USER", "ADMIN"})
    @GetMapping("/normal")
    public String zoneNormal() {
        return "zoneNormal";
    }

    @GetMapping("/info")
    public Authentication getInfoUser() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
