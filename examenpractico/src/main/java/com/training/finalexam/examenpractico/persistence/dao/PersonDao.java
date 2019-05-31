package com.training.finalexam.examenpractico.persistence.dao;

import com.training.finalexam.examenpractico.persistence.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
public class PersonDao implements IPersonDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    @Autowired
    public List<Pet> getAll() {
        System.out.println("---------------Printing studentList from JPQL query---------------");
        List<Pet> petList = em.createQuery("from Student order by email DESC", Pet.class).getResultList();
        for (Pet s : petList) {
            System.out.println(s);
        }
        printAllPersonWithCriteriaQuery();
        return petList;
    }
    public void printAllPersonWithCriteriaQuery() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Pet> cq = cb.createQuery(Pet.class);
        Root<Pet> rootEntry = cq.from(Pet.class);
        System.out.println("---------------Printing all students from Criteria query---------------");
        CriteriaQuery<Pet> all = cq.select(rootEntry);
        TypedQuery<Pet> allQuery = em.createQuery(all);
        for (Pet s : allQuery.getResultList()) {
            System.out.println(s);
        }
    }
}
