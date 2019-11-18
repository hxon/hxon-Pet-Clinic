package com.example.hxonpetclinic.services;

import com.example.hxonpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
