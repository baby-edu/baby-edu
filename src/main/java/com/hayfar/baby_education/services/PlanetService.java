package com.hayfar.baby_education.services;

import com.hayfar.baby_education.entity.Building;
import com.hayfar.baby_education.entity.Planet;
import com.hayfar.baby_education.repositories.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetService {

    private final PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet addPlanet(Planet planet) {
        planetRepository.save(planet);
        return planet;
    }

    public void deletePlanet(Long planetId) {
        planetRepository.deleteById(planetId);
    }

    public List<Planet> getAllPlanet() {
        return planetRepository.findAll();
    }
}
