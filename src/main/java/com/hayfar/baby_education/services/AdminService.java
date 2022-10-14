package com.hayfar.baby_education.services;

import com.hayfar.baby_education.entity.Admin;
import com.hayfar.baby_education.entity.User;
import com.hayfar.baby_education.repositories.AdminRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public ResponseEntity<Admin> addAdmin(Admin admin) {
        admin.setUserName(admin.getUserName());
        admin.setPassword(admin.getPassword());
        adminRepository.save(admin);
        return ResponseEntity.ok(admin);
    }
}