package com.launchacademy.adaptapet.seeders;

import com.launchacademy.adaptapet.models.PetTypes;
import com.launchacademy.adaptapet.respositories.PetTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PetTypesSeeder implements CommandLineRunner {

  @Autowired
  private PetTypesRepository petTypesRepo;

  @Override
  public void run(String... args) throws Exception{
    if(petTypesRepo.count() == 0) {
      PetTypes nyanCat = new PetTypes();
      nyanCat.setType("Nyan Cat");
      nyanCat.setDescription("A mystical flying space feline in the shape of a pop tart");
      petTypesRepo.save(nyanCat);

      PetTypes dragon = new PetTypes();
      dragon.setType("Dragon");
      dragon.setDescription("A powerful reptile in varied sizes with magical abilities.");
      petTypesRepo.save(dragon);

      PetTypes unicorn = new PetTypes();
      unicorn.setType("Unicorn");
      unicorn.setDescription("A equine animal, typically with white fur, easily identified by a large horn on their heads.");
      petTypesRepo.save(unicorn);
    }
    petTypesRepo.findAll().forEach(System.out::println);
  }
}
