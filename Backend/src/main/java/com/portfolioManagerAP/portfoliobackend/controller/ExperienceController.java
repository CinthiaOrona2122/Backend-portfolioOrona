package com.portfolioManagerAP.portfoliobackend.controller;

import com.portfolioManagerAP.portfoliobackend.dto.ExperienceDto;
import com.portfolioManagerAP.portfoliobackend.entity.Experience;
import com.portfolioManagerAP.portfoliobackend.service.IExperienceService;
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
@RequestMapping("/experience")
@CrossOrigin(origins = "https://orona-cinthia-portfolioap.web.app")
public class ExperienceController {

    @Autowired
    private IExperienceService experienceService;

    @GetMapping("/all")
    public List<Experience> getAll() {
        return experienceService.getAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Experience getById(@PathVariable("id") int id) {
        System.out.println("El id: " + id + " de experiencia, no fué encontrado");
        return experienceService.getById(id).get();
    }

    @PostMapping("/create")
    @ResponseBody
    public Experience save(@RequestBody ExperienceDto experienceDto) {
        Experience experience = new Experience(experienceDto.getJob_position(), experienceDto.getCompany_name(),
                experienceDto.getUrl_img(), experienceDto.getJob_type(), experienceDto.getDateStart(),
                experienceDto.getDateEnd(), experienceDto.getUrl());
        experienceService.save(experience);
        System.out.println("Nuevo item de Experience creado!! " + experience);
        return experienceService.save(experience);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public Experience update(@PathVariable("id") int id, @RequestBody ExperienceDto experienceDto) {
        if (!experienceService.existsById(id)) {
            System.out.println("El id n°: " + id + " de experiencia, no fué encontrado");
        }
        Experience experience = experienceService.getById(id).get();
        experience.setJob_position(experienceDto.getJob_position());
        experience.setCompany_name(experienceDto.getCompany_name());
        experience.setUrl_img(experienceDto.getUrl_img());
        experience.setJob_type(experienceDto.getJob_type());
        experience.setDateStart(experienceDto.getDateStart());
        experience.setDateEnd(experienceDto.getDateEnd());
        experience.setUrl(experienceDto.getUrl());
        experienceService.save(experience);
        System.out.println("El item id:" + id + " de experiencia fué actualizada !!");
        return experienceService.save(experience);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        experienceService.delete(id);
        System.out.println("El id: "+ id + " de educación fué eliminado.");
    }

}
