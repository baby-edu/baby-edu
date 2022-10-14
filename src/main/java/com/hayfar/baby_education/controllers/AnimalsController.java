package com.hayfar.baby_education.controllers;

import com.hayfar.baby_education.entity.Animals;
import com.hayfar.baby_education.services.AnimalsService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalsController {
    private final AnimalsService animalsService;

    public AnimalsController(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }

    @PostMapping("/add")
//    @PreAuthorize("hasRole('USER')")
    public Animals addAnimal(@RequestBody Animals animals){
        return animalsService.addAnimal(animals);
    }

    @DeleteMapping("/delete/{animalId}")
    public ResponseEntity deleteAnimal(@PathVariable Long animalId){
        animalsService.deleteAnimal(animalId);
        return ResponseEntity.ok("Silindi : " + animalId);
    }


    @GetMapping("/getAll")
    public List<Animals> getAllAnimals(){
        return animalsService.getAllAnimals();
    }

}
