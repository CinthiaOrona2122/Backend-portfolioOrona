package com.portfolioManagerAP.portfoliobackend.controller;

import com.portfolioManagerAP.portfoliobackend.dto.PersonDto;
import com.portfolioManagerAP.portfoliobackend.entity.Person;
import com.portfolioManagerAP.portfoliobackend.service.IPersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@CrossOrigin(origins = "https://orona-cinthia-portfolioap.web.app")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @GetMapping("/all")
    @ResponseBody
    public List<Person> getAll() {
        System.out.println("Toda la lista del about fué consultada");
        return personService.getAll();        
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Person getById(@PathVariable("id") int id) {
        System.out.println("La Persona  id: " + id + " fué consultado");
        return personService.getById(id).get();
    }

    @PostMapping("/create")
    @ResponseBody
    public Person save(@RequestBody PersonDto personDto) {        
        Person person = new Person(personDto.getName(), personDto.getLastname(), personDto.getCuit(), personDto.getUrl_img(), 
                personDto.getInterest(), personDto.getBirthday(), personDto.getLocation());
        personService.save(person);
        System.out.println("Nueva Persona fué creada: " + person);
        return personService.save(person);
    }

    @PutMapping("/update/{id}")
    public Person update(@PathVariable("id") int id, @RequestBody PersonDto personDto) {
        if (!personService.existsById(id)) {
            System.out.println("La persona id: " + id + " no fué encontrada");
        }
        Person person = personService.getById(id).get();
        person.setName(personDto.getName());
        person.setLastname(personDto.getLastname());
        person.setCuit(personDto.getCuit());
        person.setUrl_img(personDto.getUrl_img());
        person.setInterest(personDto.getInterest());
        person.setBirthday(personDto.getBirthday());
        person.setLocation(personDto.getLocation());
        personService.save(person);
        System.out.println("La persona id: " + id + " fué actualizada");
        return personService.save(person);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        personService.delete(id);
        System.out.println("La persona id: " + id + " fué eliminada");
    }

}
