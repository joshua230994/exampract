package com.training.finalexam.examenpractico.persistence.service;

import com.training.finalexam.examenpractico.persistence.dao.PersonDao;
import com.training.finalexam.examenpractico.persistence.entity.Pet;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PersonService {
    @Transactional
    public List<Pet> petList() {
        PersonDao personDao = null;
        return personDao.getAll();
    }
}
