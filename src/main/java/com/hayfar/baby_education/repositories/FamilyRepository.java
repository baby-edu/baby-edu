package com.hayfar.baby_education.repositories;

import com.hayfar.baby_education.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository <Family, Long> {
}
