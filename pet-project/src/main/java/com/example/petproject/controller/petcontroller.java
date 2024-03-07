package com.example.petproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.petproject.model.petModel;
import com.example.petproject.services.petServices;

@RestController
public class petcontroller {
	
	@Autowired
    private petServices petService;

    @GetMapping
    public List<petModel> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping("/{id}")
    public petModel getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }

    @PostMapping
    public petModel saveOrUpdatePet(@RequestBody petModel pet) {
        return petService.saveOrUpdatePet(pet);
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }

}
