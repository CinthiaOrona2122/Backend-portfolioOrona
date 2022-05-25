package com.portfolioManagerAP.portfoliobackend.controller;

import com.portfolioManagerAP.portfoliobackend.dto.ProgressDto;
import com.portfolioManagerAP.portfoliobackend.entity.Progress;
import com.portfolioManagerAP.portfoliobackend.service.IProgressService;
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
@RequestMapping("/progress")
@CrossOrigin(origins = "https://orona-cinthia-portfolioap.web.app")
public class ProgressController {
    
    @Autowired
    private IProgressService progressService ;
    
    @GetMapping("/all")
    @ResponseBody
    public List<Progress> getAll() {
        System.out.println("Toda la lista de progreso fué consultada ");
        return progressService.getAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Progress getById(@PathVariable("id") int id) {
        System.out.println("El progreso  id n°: " + id + " fué consultado");
        return progressService.getById(id).get();
    }
    
    @PostMapping("/create")
    @ResponseBody    
    public Progress save(@RequestBody ProgressDto progressDto) {
        Progress progress = new Progress(progressDto.getName(), progressDto.getQuote(), progressDto.getNumber());
        progressService.save(progress);
        System.out.println("Nuevo Progreso creado: " + progress);
        return progressService.save(progress);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public Progress update(@PathVariable("id") int id, @RequestBody ProgressDto progressDto) {
        if (!progressService.existsById(id)) {
            System.out.println("El progreso id: " + id + " no fué encontrado");
        }
        Progress progress = progressService.getById(id).get();
        progress.setName(progressDto.getName());
        progress.setQuote(progressDto.getQuote());
        progress.setNumber(progressDto.getNumber());
        progressService.save(progress);
        System.out.println("El progreso id: " + id + " fué actualizado");
        return progressService.save(progress);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        progressService.delete(id);
        System.out.println("El progreso id: " + id + " fué eliminado");
    }
    
}
