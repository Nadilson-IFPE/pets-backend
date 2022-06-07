package br.com.treinaweb.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import br.com.treinaweb.adoteumpet.api.pet.dto.PetRequest;
import br.com.treinaweb.adoteumpet.api.pet.dto.PetResponse;
import br.com.treinaweb.adoteumpet.core.models.Pet;

@Component
public class PetMapper {
    
    public PetResponse toResponse(Pet pet) {
//        var petResponse = new PetResponse();
//        petResponse.setId(pet.getId());
//        petResponse.setNome(pet.getNome());
//        petResponse.setHistoria(pet.getHistoria());
//        petResponse.setFoto(pet.getFoto());
//
//        return petResponse;
    	
    	return PetResponse.builder()
    			.id(pet.getId())
    			.nome(pet.getNome())
    			.historia(pet.getHistoria())
    			.foto(pet.getFoto())
    			.build();
    }
    
    public Pet toModel(PetRequest petRequest) {
    	return Pet.builder()
		.nome(petRequest.getNome())
		.historia(petRequest.getHistoria())
		.foto(petRequest.getFoto())
		.build();
    }
}
