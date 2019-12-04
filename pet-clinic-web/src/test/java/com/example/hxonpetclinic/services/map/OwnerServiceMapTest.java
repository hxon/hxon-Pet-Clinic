package com.example.hxonpetclinic.services.map;

import com.example.hxonpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    final Long ownerId = 1L;
    final String lastName = "Smith";

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
        ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findById() {
        Owner byId = ownerServiceMap.findById(ownerId);

        assertEquals(ownerId, byId.getId());

    }

    @Test
    void saveExistingId() {
        long id = 2L;

        Owner save = ownerServiceMap.save(Owner.builder().id(id).build());

        assertEquals(id, save.getId());
    }

    @Test
    void saveNoId() {
        Owner save = ownerServiceMap.save(Owner.builder().build());

        assertNotNull(save);
        assertNotNull(save.getId());
    }

    @Test
    void findAll() {
        Set<Owner> all = ownerServiceMap.findAll();
        assertEquals(1, all.size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);

        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));

        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner byLastName = ownerServiceMap.findByLastName(lastName);

        assertNotNull(byLastName);
        assertEquals(ownerId, byLastName.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner byLastName = ownerServiceMap.findByLastName("foo");

        assertNull(byLastName);
    }
}