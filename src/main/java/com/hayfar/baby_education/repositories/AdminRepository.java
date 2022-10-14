package com.hayfar.baby_education.repositories;

import com.hayfar.baby_education.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    Admin findByUserName(String userName);
}
