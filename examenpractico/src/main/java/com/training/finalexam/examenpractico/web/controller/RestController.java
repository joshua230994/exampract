package com.training.finalexam.examenpractico.web.controller;

import com.training.finalexam.examenpractico.persistence.entity.Person;
import com.training.finalexam.examenpractico.persistence.entity.Pet;
import com.training.finalexam.examenpractico.persistence.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class RestController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listPet(ModelMap model){
        List<Pet> petList;
        petList = personService.petList();
        model.put("petList", petList);
        return "persons";
    }

}
