package com.portfolioManagerAP.portfoliobackend.repository;

import com.portfolioManagerAP.portfoliobackend.entity.Achievement;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementRepository extends JpaRepository<Achievement, Integer> {
    
    boolean existsById(int id);

    Optional<Achievement> getById(int id);
    
}
