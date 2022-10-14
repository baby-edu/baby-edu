package com.hayfar.baby_education.services;

import com.hayfar.baby_education.entity.User;
import com.hayfar.baby_education.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<User> addUser(User user){
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }
    public ResponseEntity<User> updateUser(User user){
        user.setUserName(user.getUserName());
        user.setPassword(user.getPassword());
        return ResponseEntity.ok(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public String deleteUser(Long userId){
         userRepository.deleteById(userId);
         return "Silindi"+ userId;
    }
    public Optional<User> findUser(Long userId){
        return userRepository.findById(userId);
    }


    public User getUserByUserName(String username) {

        return userRepository.findByUserName(username);
    }
}
