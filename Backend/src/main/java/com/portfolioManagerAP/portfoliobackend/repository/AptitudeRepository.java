package com.portfolioManagerAP.portfoliobackend.repository;

import com.portfolioManagerAP.portfoliobackend.entity.Aptitude;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AptitudeRepository extends JpaRepository<Aptitude, Integer>{
    
    boolean existsById(int id);

    Optional<Aptitude> getById(int id);
    
}
