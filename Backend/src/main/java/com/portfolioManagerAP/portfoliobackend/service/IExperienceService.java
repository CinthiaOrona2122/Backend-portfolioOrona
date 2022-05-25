package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Experience;
import java.util.List;
import java.util.Optional;

public interface IExperienceService {

    public List<Experience> getAll();

    public Optional<Experience> getById(int id);

    public Experience save(Experience experience);
    
    public Experience update(Experience experience);

    public void delete(int id);

    public boolean existsById(int id);

}
