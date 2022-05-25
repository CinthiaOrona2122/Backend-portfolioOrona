package com.portfolioManagerAP.portfoliobackend.controller;

import com.portfolioManagerAP.portfoliobackend.dto.AptitudeDto;
import com.portfolioManagerAP.portfoliobackend.entity.Aptitude;
import com.portfolioManagerAP.portfoliobackend.service.IAptitudeService;
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
@RequestMapping("/aptitude")
@CrossOrigin(origins = "https://orona-cinthia-portfolioap.web.app")
public class AptitudeController {

    @Autowired
    private IAptitudeService aptitudeService;

    @GetMapping("/all")
    @ResponseBody
    public List<Aptitude> getAll() {
        System.out.println("Toda la lista de aptitudes fué consultada");
        return aptitudeService.getAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Aptitude getById(@PathVariable("id") int id) {
        System.out.println("Toda la lista de aptitudes fué consultada");
        return aptitudeService.getById(id).get();
    }

    @PostMapping("/create")
    @ResponseBody
    public Aptitude save(@RequestBody AptitudeDto aptitudeDto) {
        Aptitude aptitude = new Aptitude(aptitudeDto.getName(), aptitudeDto.getConfirmerName(), aptitudeDto.getDescription());
        aptitudeService.save(aptitude);
        System.out.println("Nueva aptitude creada: " + aptitude);
        return aptitudeService.save(aptitude);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public Aptitude update(@PathVariable("id") int id, @RequestBody AptitudeDto aptitudeDto) {
        if (!aptitudeService.existsById(id)) {
            System.out.println("La aptitud id: " + id + " no fué encontrada");
        }
        Aptitude aptitude = aptitudeService.getById(id).get();
        aptitude.setName(aptitudeDto.getName());
        aptitude.setConfirmerName(aptitudeDto.getConfirmerName());
        aptitude.setDescription(aptitudeDto.getDescription());
        aptitudeService.save(aptitude);
        System.out.println("La aptitud id: " + id + " fué actualizado");
        return aptitudeService.save(aptitude);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        aptitudeService.delete(id);
        System.out.println("La aptitude id: " + id + " fué eliminada");
    }

}
