package com.hayfar.baby_education.services;

import com.hayfar.baby_education.entity.Animal;
import com.hayfar.baby_education.repositories.AnimalsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalsService {

    private final AnimalsRepository animalsRepository;

    public AnimalsService(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
    }

    public Animal addAnimal(Animal animals) {
        Animal editAnimals = new Animal();
        editAnimals.setName(animals.getName());
        editAnimals.setDescription(animals.getDescription());
        editAnimals.setImage(animals.getImage());
        animalsRepository.save(editAnimals);
        return animals;
    }

    public List<Animal> getAllAnimals() {
        return animalsRepository.findAll();
    }

    public Optional<Animal> findAnimal(Long billId) {
        return animalsRepository.findById(billId);
    }

    public void deleteAnimal(Long billId) {
        animalsRepository.deleteById(billId);
    }
}
