package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.entity.Person;
import com.portfolioManagerAP.portfoliobackend.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonService implements IPersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> getById(int id) {
        return personRepository.findById(id);

    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }
    
    @Override
    public Person update(Person person) {
       return personRepository.save(person);
    }

    @Override
    public void delete(int id) {
        personRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return personRepository.existsById(id);
    }

}
