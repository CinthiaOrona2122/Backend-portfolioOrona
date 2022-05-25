package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Person;
import java.util.List;
import java.util.Optional;

public interface IPersonService {

    public List<Person> getAll();

    public Optional<Person> getById(int id);

    public Person save(Person person);
    
    public Person update(Person person);

    public void delete(int id);

    public boolean existsById(int id);

}
