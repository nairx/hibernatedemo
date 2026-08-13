package com.example;
import com.example.entity.*;

import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("My Application!");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        System.out.println("My Application");
        //actions;
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //Product product = new Product("Product 1",100);
        //em.persist(product);
         User user = new User("John","john@gmail.com","pass1234");
        em.persist(user);
        tx.commit();
        em.close();
        emf.close();
    }
}