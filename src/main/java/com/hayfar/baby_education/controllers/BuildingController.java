package com.hayfar.baby_education.controllers;

import com.hayfar.baby_education.entity.Building;
import com.hayfar.baby_education.services.BuildingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/buildings")
public class BuildingController {
    private final BuildingService buildingService;

    public BuildingController(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @PostMapping("/add")
    public Building addBuilding(@RequestBody Building building){
        return buildingService.addBuilding(building);
    }

    @DeleteMapping("/delete/{animalId}")
    public ResponseEntity deleteBuilding(@PathVariable Long buildingId){
        buildingService.deleteBuilding(buildingId);
        return ResponseEntity.ok("Silindi : " + buildingId);
    }

    @GetMapping
    public List<Building> getAllBuilding(){
        return buildingService.getAllBuilding();
    }

}
