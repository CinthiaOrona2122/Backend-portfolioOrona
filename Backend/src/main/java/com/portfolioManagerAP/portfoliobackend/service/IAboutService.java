package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.About;
import java.util.List;
import java.util.Optional;

public interface IAboutService {

    public List<About> getAll();

    public Optional<About> getById(int id);

    public About save(About about);
    
    public About update(About about);
    
    public void delete(int id);

    public boolean existsById(int id);

    
}
