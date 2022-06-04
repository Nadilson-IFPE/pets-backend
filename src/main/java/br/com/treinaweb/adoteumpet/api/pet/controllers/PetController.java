package br.com.treinaweb.adoteumpet.api.pet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.adoteumpet.core.models.Pet;
import br.com.treinaweb.adoteumpet.core.repositories.PetRepository;

@RestController
public class PetController {
    
    @Autowired
    private PetRepository petRepository;

    @GetMapping("/pets")
    public List<Pet> findAll() {
        return petRepository.findAll();
    }
}
