package com.hayfar.baby_education.repositories;

import com.hayfar.baby_education.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantsRepository extends JpaRepository<Plant,Long> {
}
