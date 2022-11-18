package com.hayfar.baby_education.controllers;

import com.hayfar.baby_education.entity.Animal;
import com.hayfar.baby_education.services.AnimalsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
@CrossOrigin
public class AnimalsController {
    private final AnimalsService animalsService;

    public AnimalsController(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }

    @PostMapping("/add")
    public Animal addAnimal(@RequestBody Animal animals){
        return animalsService.addAnimal(animals);
    }

    @DeleteMapping("/delete/{animalId}")
    public ResponseEntity deleteAnimal(@PathVariable Long animalId){
        animalsService.deleteAnimal(animalId);
        return ResponseEntity.ok("Silindi : " + animalId);
    }


    @GetMapping("/getAll")
    public List<Animal> getAllAnimals(){
        return animalsService.getAllAnimals();
    }

}
