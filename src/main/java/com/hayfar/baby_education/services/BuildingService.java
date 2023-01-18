package com.hayfar.baby_education.services;

import com.hayfar.baby_education.entity.Animal;
import com.hayfar.baby_education.entity.Building;
import com.hayfar.baby_education.repositories.BuildingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingService {
    private final BuildingRepository buildingRepository;

    public BuildingService(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    public Building addBuilding(Building building) {
        Building editBuilding = new Building();
        editBuilding.setName(building.getName());
        editBuilding.setDescription(building.getDescription());
        editBuilding.setImage(building.getImage());
        buildingRepository.save(editBuilding);
        return building;
    }

    public List<Building> getAllBuilding() {
        return buildingRepository.findAll();
    }

    public Optional<Building> findBuilding(Long id) {
        return buildingRepository.findById(id);
    }

    public void deleteBuilding(Long id) {
        buildingRepository.deleteById(id);
    }

}
