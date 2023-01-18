package com.hayfar.baby_education.controllers;

import com.hayfar.baby_education.entity.Building;
import com.hayfar.baby_education.entity.Family;
import com.hayfar.baby_education.services.FamilyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/families")
public class FamilyController {
    private final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }
    @PostMapping("/add")
    public Family addFamily(@RequestBody Family family){
        return familyService.addFamily(family);
    }

    @DeleteMapping("/delete/{familyId}")
    public ResponseEntity deleteFamily(@PathVariable Long familyId){
        familyService.deleteFamily(familyId);
        return ResponseEntity.ok("Silindi : " + familyId);
    }

    @GetMapping
    public List<Family> getAllFamily(){
        return familyService.getAllFamily();
    }

}
