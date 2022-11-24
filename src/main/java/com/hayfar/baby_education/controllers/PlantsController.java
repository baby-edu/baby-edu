package com.hayfar.baby_education.controllers;

import com.hayfar.baby_education.entity.Plant;
import com.hayfar.baby_education.services.PlantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/plants")
public class PlantsController {

    private final PlantService plantService;

    public PlantsController(PlantService plantService) {
        this.plantService = plantService;
    }

    @PostMapping("/add")
    public Plant addAnimal(@RequestBody Plant plants){
        return plantService.addPlants(plants);
    }

    @DeleteMapping("/delete/{plantId}")
    public ResponseEntity deletePlant(@PathVariable Long plantId){
        plantService.deletePlant(plantId);
        return ResponseEntity.ok("Silindi : " + plantId);
    }

    @GetMapping
    public List<Plant> getAllPlants(){
        return plantService.getAllPlants();
    }
}
