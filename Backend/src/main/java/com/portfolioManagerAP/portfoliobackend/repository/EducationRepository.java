package com.portfolioManagerAP.portfoliobackend.repository;

import com.portfolioManagerAP.portfoliobackend.entity.Education;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {
    
    boolean existsById(int id);

    Optional<Education> getById(int id);
    
}
