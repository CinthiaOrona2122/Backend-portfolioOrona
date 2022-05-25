package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Experience;
import com.portfolioManagerAP.portfoliobackend.repository.ExperienceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienceService implements IExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public List<Experience> getAll() {
        return experienceRepository.findAll();
    }

    @Override
    public Optional<Experience> getById(int id) {
        return experienceRepository.findById(id);
    }

    @Override
    public Experience save(Experience experience) {
        return experienceRepository.save(experience);
    }
    
    @Override
    public Experience update(Experience experience) {
       return experienceRepository.save(experience);
    }

    @Override
    public void delete(int id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return experienceRepository.existsById(id);
    }

}
