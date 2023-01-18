package com.hayfar.baby_education.repositories;

import com.hayfar.baby_education.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository <Planet, Long> {
}
