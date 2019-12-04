package com.example.hxonpetclinic.services.map;

import com.example.hxonpetclinic.model.Visit;
import com.example.hxonpetclinic.services.VisitService;

import java.util.Set;

public class VisitServiceMap extends AbstractServiceMap<Visit, Long> implements VisitService {


    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }
}
