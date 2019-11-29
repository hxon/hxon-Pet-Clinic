package com.example.hxonpetclinic.services.springdatajpa;

import com.example.hxonpetclinic.model.Vet;
import com.example.hxonpetclinic.repositories.VetsRepository;
import com.example.hxonpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetsRepository vetsRepository;

    public VetSDJpaService(VetsRepository vetsRepository) {
        this.vetsRepository = vetsRepository;
    }

    @Override
    public Vet findByLastName(String lastName) {
        return vetsRepository.findByLastName(lastName);
    }

    @Override
    public Vet findById(Long aLong) {
        return vetsRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetsRepository.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetsRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public void delete(Vet object) {
        vetsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetsRepository.deleteById(aLong);
    }
}
