package com.yemelyanenka.restapi.controller;

import com.yemelyanenka.restapi.entity.Pets;
import com.yemelyanenka.restapi.repository.implementations.PetsRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/pets")
public class PetsGetController {

    @Autowired
    private PetsRepositoryImpl petsRepositoryImpl;

    @GetMapping
    public String GetPets(){
        Optional<Pets> pet = petsRepositoryImpl.findPetByName("Vasia");
        return "Name: " + pet.get().getName() + ", Age: "+ pet.get().getAge();
    }
}
