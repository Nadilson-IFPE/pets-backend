package br.com.treinaweb.adoteumpet.api.pet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.adoteumpet.api.pet.dto.PetResponse;
import br.com.treinaweb.adoteumpet.api.pet.mappers.PetMapper;
import br.com.treinaweb.adoteumpet.core.repositories.PetRepository;

@RestController
public class PetController {
    
    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;

    @GetMapping("/api/pets")
    public List<PetResponse> findAll() {
//        var pets = petRepository.findAll();
//        var petResponses = new ArrayList<PetResponse>();
//
//        for (Pet pet : pets) {
//            petResponses.add(petMapper.toResponse(pet));
//        }
//
//        return petResponses;
    	
    	return petRepository.findAll()
    			.stream()
    			//.map((pet) -> petMapper.toResponse(pet))
    			// Linha acima ou:
    			.map(petMapper::toResponse)
    			//.collect(Collectors.toList());
    			// Linha acima ou:
    			.toList();
    }
}
