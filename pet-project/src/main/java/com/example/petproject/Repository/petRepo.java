package com.example.petproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petproject.model.petModel;


@Repository
public interface petRepo extends JpaRepository<petModel, Long>{

}
