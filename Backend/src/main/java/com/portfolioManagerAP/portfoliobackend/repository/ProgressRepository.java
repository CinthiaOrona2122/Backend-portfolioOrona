package com.portfolioManagerAP.portfoliobackend.repository;

import com.portfolioManagerAP.portfoliobackend.entity.Progress;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Integer>{
    
    boolean existsById(int id);

    Optional<Progress> getById(int id);
    
}
