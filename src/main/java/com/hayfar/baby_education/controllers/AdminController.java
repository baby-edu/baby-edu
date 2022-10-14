package com.hayfar.baby_education.controllers;

import com.hayfar.baby_education.entity.Admin;
import com.hayfar.baby_education.services.AdminService;
import com.hayfar.baby_education.services.AuthService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('ADMIN')")
    public Admin singUp(@RequestBody Admin admin){
        adminService.addAdmin(admin);
        return admin;
    }
}
