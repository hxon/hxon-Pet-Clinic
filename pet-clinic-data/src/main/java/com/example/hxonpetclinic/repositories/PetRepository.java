package com.example.hxonpetclinic.repositories;

import com.example.hxonpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
