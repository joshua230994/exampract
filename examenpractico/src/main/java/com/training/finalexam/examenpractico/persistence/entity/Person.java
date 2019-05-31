package com.training.finalexam.examenpractico.persistence.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity

public class Person {
    @Column(name ="first_name", nullable = false)
    private String firstname;
   @Column(name ="last_name", nullable = false)
    private String lastname;

   private Integer age;

   private List<Pet> enrolledPetsList;
}
