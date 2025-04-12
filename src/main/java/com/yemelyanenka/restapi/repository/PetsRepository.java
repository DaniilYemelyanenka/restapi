package com.yemelyanenka.restapi.repository;

import com.yemelyanenka.restapi.entity.Pets;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PetsRepository {

    Optional<Pets> saveToDatabase(Pets pet);

    Optional<Pets> findPetByName(String name);

}
