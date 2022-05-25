package com.portfolioManagerAP.portfoliobackend.controller;

import com.portfolioManagerAP.portfoliobackend.dto.AboutDto;
import com.portfolioManagerAP.portfoliobackend.entity.About;
import com.portfolioManagerAP.portfoliobackend.service.IAboutService;
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
@RequestMapping("/about")
@CrossOrigin(origins = "https://orona-cinthia-portfolioap.web.app")
public class AboutController {

    @Autowired
    private IAboutService aboutService;

    @GetMapping("/all")
    @ResponseBody
    public List<About> getAll() {
        System.out.println("Toda la lista del about fué consultada");
        return aboutService.getAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public About getById(@PathVariable("id") int id) {
        System.out.println("El About  id: " + id + " fué consultado");
        return aboutService.getById(id).get();
    }

    @PostMapping("/create")
    @ResponseBody
    public About save(@RequestBody AboutDto aboutDto) {
        About about = new About(aboutDto.getText());
        aboutService.save(about);
        System.out.println("Nuevo About creado: " + about);
        return aboutService.save(about);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public About update(@PathVariable("id") int id, @RequestBody AboutDto aboutDto) {
        if (!aboutService.existsById(id)) {
            System.out.println("El About id: " + id + " no fué encontrado");
        }
        About about = aboutService.getById(id).get();
        about.setText(aboutDto.getText());
        aboutService.save(about);
        System.out.println("El About id: " + id + " texto: " + about + " fué actualizado");
        return aboutService.save(about);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        aboutService.delete(id);
        System.out.println("About id: " + id + " fué eliminado");
    }

}
