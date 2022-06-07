package br.com.treinaweb.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.treinaweb.adoteumpet.core.models.Pet;
import br.com.treinaweb.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet1 = new Pet();
		pet1.setNome("Zeus");
		pet1.setHistoria("História emocionante");
		pet1.setFoto("/imagens/zeus.jpg");
		petRepository.save(pet1);
		
		var pet2 = new Pet();
		pet2.setNome("Luma");
		pet2.setHistoria("História emocionante");
		pet2.setFoto("/imagens/luma.jpg");
		petRepository.save(pet2);
	}

}
