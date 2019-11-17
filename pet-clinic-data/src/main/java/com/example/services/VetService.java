package com.example.services;

import com.example.model.Vet;


public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);
}
