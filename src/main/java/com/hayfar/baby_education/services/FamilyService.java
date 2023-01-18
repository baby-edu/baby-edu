package com.hayfar.baby_education.services;

import com.hayfar.baby_education.entity.Family;
import com.hayfar.baby_education.repositories.FamilyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyService {

    private final FamilyRepository familyRepository;

    public FamilyService(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    public Family addFamily(Family family) {
        return family;
    }

    public void deleteFamily(Long familyId) {
        familyRepository.deleteById(familyId);
    }

    public List<Family> getAllFamily() {
        return familyRepository.findAll();
    }
}
