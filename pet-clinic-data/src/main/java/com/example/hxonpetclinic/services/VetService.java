package com.example.hxonpetclinic.services;

import com.example.hxonpetclinic.model.Vet;


public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);
}
