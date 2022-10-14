package com.hayfar.baby_education.services;

import com.hayfar.baby_education.entity.Admin;
import com.hayfar.baby_education.repositories.AdminRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final AdminRepository authRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthService(AdminRepository authRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.authRepository = authRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Admin loadByUsername(Admin admin) {
        Admin existAdmin = new Admin();
        existAdmin.setUserName(admin.getUserName());
        existAdmin.setPassword(bCryptPasswordEncoder.encode(admin.getPassword()));
        authRepository.save(existAdmin);
        return existAdmin;
    }
}
