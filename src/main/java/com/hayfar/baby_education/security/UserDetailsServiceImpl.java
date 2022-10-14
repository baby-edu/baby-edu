/*
package com.hayfar.baby_education.security;

import com.hayfar.baby_education.entity.Admin;
import com.hayfar.baby_education.repositories.AuthRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private AuthRepository authRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserDetailsServiceImpl(AuthRepository authRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.authRepository = authRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Admin admin = authRepository.findByUserName(userName);
        if (admin == null) {
            throw new UsernameNotFoundException(userName);
        }
        return new User(admin.getUserName(), admin.getPassword(), emptyList());
    }
    public Admin loadByUsername(Admin admin) {
        Admin existAdmin = new Admin();
        existAdmin.setUserName(admin.getUserName());
        existAdmin.setPassword(bCryptPasswordEncoder.encode(admin.getPassword()));
        authRepository.save(existAdmin);
        return existAdmin;
    }
}
*/
