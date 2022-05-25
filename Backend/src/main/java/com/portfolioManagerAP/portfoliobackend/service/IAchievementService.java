package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Achievement;
import java.util.List;
import java.util.Optional;

public interface IAchievementService {
    
    public List<Achievement> getAll();

    public Optional<Achievement> getById(int id);

    public Achievement save(Achievement achievement);
    
    public Achievement update(Achievement achievement);

    public void delete(int id);

    public boolean existsById(int id);
    
}
