package com.portfolioManagerAP.portfoliobackend.controller;

import com.portfolioManagerAP.portfoliobackend.dto.AchievementDto;
import com.portfolioManagerAP.portfoliobackend.entity.Achievement;
import com.portfolioManagerAP.portfoliobackend.service.IAchievementService;
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
@RequestMapping("/achievement")
@CrossOrigin(origins = "https://orona-cinthia-portfolioap.web.app")
public class AchievementController {
    
    @Autowired
    private IAchievementService achievementService;
    
    @GetMapping("/all")
    @ResponseBody
    public List<Achievement> getAll() {
        System.out.println("Toda la lista de achievements fué consultada");
        return achievementService.getAll();
    }
    
    @GetMapping("/find/{id}")
    @ResponseBody
    public Achievement getById(@PathVariable("id") int id) {
        System.out.println("Toda la lista de los achievements fué consultada");
        return achievementService.getById(id).get();
    }
    
    @PostMapping("/create")
    @ResponseBody
    public Achievement save(@RequestBody AchievementDto achievementDto) {
        Achievement achievement = new Achievement(achievementDto.getName() , achievementDto.getDescription(), achievementDto.getUrl(), achievementDto.getProject_type());
        achievementService.save(achievement);
        System.out.println("Nuevo achievement creado: " + achievement);
        return achievementService.save(achievement);
    }
    
    @PutMapping("/update/{id}")
    @ResponseBody
    public Achievement update(@PathVariable("id") int id, @RequestBody AchievementDto achievementDto) {
        if (!achievementService.existsById(id)) {
            System.out.println("El achievement id: " + id + " no fué encontrado");
        }
        Achievement achievement = achievementService.getById(id).get();
        achievement.setName(achievementDto.getName());
        achievement.setDescription(achievementDto.getDescription());
        achievement.setUrl(achievementDto.getUrl());
        achievement.setProject_type(achievementDto.getProject_type());
        achievementService.save(achievement);
        System.out.println("El About id: " + id + " fué actualizado");
        return achievementService.save(achievement);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        achievementService.delete(id);
        System.out.println("El achievement id: " + id + " fué eliminado");
    }
    
}
