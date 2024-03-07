package com.example.petproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.petproject.Repository.petRepo;
import com.example.petproject.model.petModel;

public class petServices {
	
	@Autowired
	private petRepo Repo;

    public List<petModel> getAllPets() {
        return Repo.findAll();
    }

    public petModel getPetById(Long id) {
        return Repo.findById(id).orElse(null);
    }

    public petModel saveOrUpdatePet(petModel pet) {
        return Repo.save(pet);
    }

    public void deletePet(Long id) {
        Repo.deleteById(id);
    }
}
