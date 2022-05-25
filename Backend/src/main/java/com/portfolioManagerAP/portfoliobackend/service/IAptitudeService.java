package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Aptitude;
import java.util.List;
import java.util.Optional;

public interface IAptitudeService {
    
    public List<Aptitude> getAll();

    public Optional<Aptitude> getById(int id);

    public Aptitude save(Aptitude aptitude);
    
    public Aptitude update(Aptitude aptitude);

    public void delete(int id);

    public boolean existsById(int id);
    
}
