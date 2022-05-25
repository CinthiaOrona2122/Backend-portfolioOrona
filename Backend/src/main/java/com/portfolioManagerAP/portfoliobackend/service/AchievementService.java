package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Achievement;
import com.portfolioManagerAP.portfoliobackend.repository.AchievementRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AchievementService implements IAchievementService{
    
    @Autowired
    private AchievementRepository achievementRepository;

    @Override
    public List<Achievement> getAll() {
        return achievementRepository.findAll();
    }

    @Override
    public Optional<Achievement> getById(int id) {
        return achievementRepository.findById(id);
    }

    @Override
    public Achievement save(Achievement achievement) {
        return achievementRepository.save(achievement);
    }
    
    @Override
    public Achievement update(Achievement achievement) {
       return achievementRepository.save(achievement);
    }

    @Override
    public void delete(int id) {
        achievementRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return achievementRepository.existsById(id);
    }
    
}
