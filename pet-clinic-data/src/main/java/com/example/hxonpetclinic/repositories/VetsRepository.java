package com.example.hxonpetclinic.repositories;

import com.example.hxonpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetsRepository extends CrudRepository<Vet, Long> {
    Vet findByLastName(String lastName);
}
