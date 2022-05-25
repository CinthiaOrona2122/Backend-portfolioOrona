package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Education;
import com.portfolioManagerAP.portfoliobackend.repository.EducationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducationService implements IEducationService {

    @Autowired
    private EducationRepository educationRepository;

    @Override
    public List<Education> getAll() {
        return educationRepository.findAll();
    }

    @Override
    public Optional<Education> getById(int id) {
        return educationRepository.findById(id);
    }

    @Override
    public Education save(Education education) {
       return educationRepository.save(education);
    }
    
    @Override
    public Education update(Education education) {
       return educationRepository.save(education);
    }

    @Override
    public void delete(int id) {
        educationRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return educationRepository.existsById(id);
    }

}
