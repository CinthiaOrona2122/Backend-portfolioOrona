package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Progress;
import com.portfolioManagerAP.portfoliobackend.repository.ProgressRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProgressService implements IProgressService{
    
    @Autowired
    private ProgressRepository progressRepository;

    @Override
    public List<Progress> getAll() {
        return progressRepository.findAll();
    }

    @Override
    public Optional<Progress> getById(int id) {
        return progressRepository.findById(id);
    }

    @Override
    public Progress save(Progress progress) {
       return progressRepository.save(progress);
    }
    
    @Override
    public Progress update(Progress progress) {
       return progressRepository.save(progress);
    }

    @Override
    public void delete(int id) {
        progressRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return progressRepository.existsById(id);
    }
    
}
