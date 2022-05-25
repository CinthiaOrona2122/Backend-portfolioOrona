
package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Progress;
import java.util.List;
import java.util.Optional;

public interface IProgressService {
    
    public List<Progress> getAll();

    public Optional<Progress> getById(int id);

    public Progress save(Progress progress);
    
    public Progress update(Progress progress);

    public void delete(int id);

    public boolean existsById(int id);
    
}
