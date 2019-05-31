package com.training.finalexam.examenpractico.persistence.dao;

import com.training.finalexam.examenpractico.persistence.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IPersonDao {
    @Autowired
    List<Pet> getAll();
}
