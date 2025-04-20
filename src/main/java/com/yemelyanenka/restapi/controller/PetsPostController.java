package com.yemelyanenka.restapi.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pets")
public class PetsPostController {



    @PostMapping
    public void PetsPost(@RequestParam String name, Integer age){
        System.out.println("name: " + name + "\n age: " + age);
    }
}
