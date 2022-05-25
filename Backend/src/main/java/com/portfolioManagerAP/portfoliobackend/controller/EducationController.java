package com.portfolioManagerAP.portfoliobackend.controller;

import com.portfolioManagerAP.portfoliobackend.dto.EducationDto;
import com.portfolioManagerAP.portfoliobackend.entity.Education;
import com.portfolioManagerAP.portfoliobackend.service.IEducationService;
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
@RequestMapping("/education")
@CrossOrigin(origins = "https://orona-cinthia-portfolioap.web.app")
public class EducationController {

    @Autowired
    private IEducationService educationService;

    
    @GetMapping("/all")
    @ResponseBody
    public List<Education> getAll() {
        System.out.println("Toda la lista de Education fué consultada");
        return educationService.getAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Education getById(@PathVariable("id") int id) {
        System.out.println("El id: " + id + " de educación, no fué encontrado");
        return educationService.getById(id).get();
    }

    @PostMapping("/create")
    @ResponseBody
    public Education save(@RequestBody EducationDto educationDto) {
        Education education = new Education(educationDto.getSchool_name(), educationDto.getTitle(), educationDto.getCareer(),
                educationDto.getUrl_img(), educationDto.getEdu_type(), educationDto.getUrl(), educationDto.getDateStart(),
                educationDto.getDateEnd(), educationDto.getScore());
        educationService.save(education);
        System.out.println("Nuevo item de Educación creado!! " + education);
        return educationService.save(education);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public Education update(@PathVariable("id") int id, @RequestBody EducationDto educationDto) {
        if(!educationService.existsById(id)){
            System.out.println("El id n°: "+ id + " de educación, no fué encontrado");
        }
        Education education = educationService.getById(id).get();
        education.setSchool_name(educationDto.getSchool_name());
        education.setTitle(educationDto.getTitle());
        education.setCareer(educationDto.getCareer());
        education.setUrl_img(educationDto.getUrl_img());
        education.setEdu_type(educationDto.getEdu_type());
        education.setUrl(educationDto.getUrl());
        education.setDateStart(educationDto.getDateStart());
        education.setDateEnd(educationDto.getDateEnd());
        education.setScore(educationDto.getScore());
        educationService.save(education);
        System.out.println("El item id:" + id + " de educación fué actualizada !!");
        return educationService.save(education);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        educationService.delete(id);
        System.out.println("El id: "+ id + " de educación fué eliminado.");
    }

}
