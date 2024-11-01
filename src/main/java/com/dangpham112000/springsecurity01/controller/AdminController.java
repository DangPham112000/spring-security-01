package com.dangpham112000.springsecurity01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/admin/")
public class AdminController {

    @GetMapping("/vip")
    public String zoneVIP() {
        return "zoneVIP";
    }

    @GetMapping("/normal")
    public String zoneNormal() {
        return "zoneNormal";
    }
}
