package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Education;
import java.util.List;
import java.util.Optional;

public interface IEducationService {

    public List<Education> getAll();

    public Optional<Education> getById(int id);

    public Education save(Education education);
    
    public Education update(Education education);

    public void delete(int id);

    public boolean existsById(int id);

}
