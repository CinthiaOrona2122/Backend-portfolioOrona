package com.portfolioManagerAP.portfoliobackend.repository;

import com.portfolioManagerAP.portfoliobackend.entity.Person;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    boolean existsById(int id);

    Optional<Person> getById(int id);

}
