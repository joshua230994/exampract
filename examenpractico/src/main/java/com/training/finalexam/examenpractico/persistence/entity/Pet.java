package com.training.finalexam.examenpractico.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Pet {
    @Column(name = "pet_name", nullable = false)
    private  String petName;

    @Column(name = "race_name", nullable = false)
    private  String raceName;

    @Enumerated(EnumType.STRING)
    @Column(name = "animal_Type")
    private AnimalStatus animalStatus;

    public Pet(String petName, String raceName, AnimalStatus animalStatus){
        this.petName =  petName;
        this.raceName = raceName;
        this.animalStatus = animalStatus;
    }
   // public  Pet(String petName, String raceName, String uuid ){
     //   this(petName, raceName, uuid, AnimalStatus.REGULAR);
    //}



}
