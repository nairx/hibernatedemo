package com.example;
import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("My Application!");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        //actions;
        em.close();
        emf.close();
    }
}