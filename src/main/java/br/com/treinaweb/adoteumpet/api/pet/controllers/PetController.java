package br.com.treinaweb.adoteumpet.api.pet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.adoteumpet.api.pet.dto.PetResponse;
import br.com.treinaweb.adoteumpet.api.pet.services.PetService;

@RestController
public class PetController {
    
	@Autowired
    private PetService petService;

    @GetMapping("/api/pets")
    public List<PetResponse> findAll() {
    	return petService.findAll();
    }
}
