package com.hayfar.baby_education.repositories;

import com.hayfar.baby_education.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long> {

    RefreshToken findByUserId(Long userId);
}
