package com.yemelyanenka.restapi.repository.implementations;

import com.yemelyanenka.restapi.entity.Pets;
import com.yemelyanenka.restapi.repository.PetsRepository;

import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.Optional;

@Repository
public class PetsRepositoryImpl implements PetsRepository {

    //TODO add sql create request for save Pet to database
    @Override
    public Optional<Pets> saveToDatabase(Pets pet) {
        return Optional.empty();
    }

    //TODO add sql read request
    @Override
    public Optional<Pets> findPetByName(String name) {
        try {
            Connection connnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetsDB","user","user");
            PreparedStatement preparedStatement = connnection.prepareStatement("select * from Pets where petname=?");
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Pets pet = new Pets();
            pet.setId(resultSet.getInt("id"));
            pet.setName(resultSet.getString("petname"));
            pet.setAge(resultSet.getInt("age"));
            connnection.close();
            return Optional.of(pet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
