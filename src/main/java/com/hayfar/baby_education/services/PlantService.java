package com.hayfar.baby_education.services;

import com.hayfar.baby_education.entity.Plant;
import com.hayfar.baby_education.repositories.PlantsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PlantService {

    private final PlantsRepository plantsRepository;

    public PlantService(PlantsRepository plantsRepository) {
        this.plantsRepository = plantsRepository;
    }

    public Plant addPlants(Plant plants) {
        Plant editPlants = new Plant();
        editPlants.setName(plants.getName());
        editPlants.setDescription(plants.getDescription());
        plantsRepository.save(editPlants);
        return plants;
    }

    public List<Plant> getAllPlants() {
        return plantsRepository.findAll();
    }

    public Optional<Plant> findPlant(Long billId) {
        return plantsRepository.findById(billId);
    }

    public void deletePlant(Long billId) {
        plantsRepository.deleteById(billId);
    }
}
