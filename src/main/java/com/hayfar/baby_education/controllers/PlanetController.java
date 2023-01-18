package com.hayfar.baby_education.controllers;

import com.hayfar.baby_education.entity.Building;
import com.hayfar.baby_education.entity.Planet;
import com.hayfar.baby_education.services.BuildingService;
import com.hayfar.baby_education.services.PlanetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/planets")
@CrossOrigin
public class PlanetController {
    private final PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    @PostMapping("/add")
    public Planet addPlanet(@RequestBody Planet planet){
        return planetService.addPlanet(planet);
    }

    @DeleteMapping("/delete/{planetId}")
    public ResponseEntity deletePlanet(@PathVariable Long planetId){
        planetService.deletePlanet(planetId);
        return ResponseEntity.ok("Silindi : " + planetId);
    }

    @GetMapping
    public List<Planet> getAllPlanet(){
        return planetService.getAllPlanet();
    }
}
