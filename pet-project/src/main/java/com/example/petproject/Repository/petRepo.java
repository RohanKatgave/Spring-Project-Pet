package com.example.petproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petproject.model.petModel;



public interface petRepo extends JpaRepository<petModel, Long>{

}
