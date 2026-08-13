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

        //Add new product
        //Product product = new Product("Product 1",100);
        //em.persist(product);

        //Find product
        // Product product = em.find(Product.class,1);
        // System.out.println(product);

        //Update product
        // Product product = em.find(Product.class,1);
        // product.setPrice(500);
        // System.out.println(product);

        //Delete product
        // Product product = em.find(Product.class,1);
        // em.remove(product);
        

        tx.commit();
        em.close();
        emf.close();
    }
}