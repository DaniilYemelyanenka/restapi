package com.yemelyanenka.restapi.repository.implementations;

import com.yemelyanenka.restapi.entity.Pets;
import com.yemelyanenka.restapi.repository.PetsRepository;

import java.util.Optional;

public class PetsRepositoryImpl implements PetsRepository {

    //TODO add sql create request for save Pet to database
    @Override
    public Optional<Pets> saveToDatabase(Pets pet) {
        return Optional.empty();
    }

    //TODO add sql read request
    @Override
    public Optional<Pets> findPetByName(String name) {
        return Optional.empty();
    }
}
