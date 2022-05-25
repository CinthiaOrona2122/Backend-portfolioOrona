package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.About;
import com.portfolioManagerAP.portfoliobackend.repository.AboutRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AboutService implements IAboutService {

    @Autowired
    private AboutRepository aboutRepository;

    @Override
    public List<About> getAll() {
        return aboutRepository.findAll();
    }

    @Override
    public Optional<About> getById(int id) {
        return aboutRepository.findById(id);
    }

    @Override
    public About save(About about) {
        return aboutRepository.save(about);
    }
        
    @Override
    public About update(About about) {
       return aboutRepository.save(about);
    }

    @Override
    public void delete(int id) {
        aboutRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return aboutRepository.existsById(id);
    }

}
