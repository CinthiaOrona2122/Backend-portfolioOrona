package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Aptitude;
import com.portfolioManagerAP.portfoliobackend.repository.AptitudeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AptitudeService implements IAptitudeService{
    
    @Autowired
    private AptitudeRepository aptitudeRepository;

    @Override
    public List<Aptitude> getAll() {
        return aptitudeRepository.findAll();
    }

    @Override
    public Optional<Aptitude> getById(int id) {
        return aptitudeRepository.findById(id);
    }

    @Override
    public Aptitude save(Aptitude aptitude) {
        return aptitudeRepository.save(aptitude);
    }
    
    @Override
    public Aptitude update(Aptitude aptitude) {
       return aptitudeRepository.save(aptitude);
    }

    @Override
    public void delete(int id) {
        aptitudeRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return aptitudeRepository.existsById(id);
    }
    
    
}
