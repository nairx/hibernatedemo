package com.example;

import com.example.entity.*;

import java.util.*;
import jakarta.persistence.*;
import jakarta.persistence.criteria.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("My Application!");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        System.out.println("My Application");

        // actions;
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Add new product
        // Product product = new Product("Product 1", 100);
        // em.persist(product);
        // Product product = new Product("Product 2", 120);
        // em.persist(product);
        // Product product = new Product("Product 3", 140);
        // em.persist(product);

        // Find product
        // Product product = em.find(Product.class,1);
        // System.out.println(product);

        // Update product
        // Product product = em.find(Product.class,1);
        // product.setPrice(500);
        // System.out.println(product);

        // Delete product
        // Product product = em.find(Product.class,1);
        // em.remove(product);

        // TypedQuery<Product> query = em.createQuery("from Product where price >
        // 100",Product.class);
        // List<Product> products = query.getResultList();
        // products.forEach(System.out::println);

        // Query query = em.createQuery("update Product set price = 900 where id=2");
        // int count = query.executeUpdate();
        // System.out.println(count + " record updated");

        // TypedQuery<Product> query = em.createQuery("from Product where price >
        // :price", Product.class);
        // query.setParameter("price", 120);
        // List<Product> products = query.getResultList();
        // products.forEach(System.out::println);

        // One to One Relation
        // Profile profile = new Profile();
        // profile.setProfileId(1);
        // profile.setCity("NYC");
        // profile.setPhone("9566777887");
        // profile.setCountry("USA");
        // User user = new User();
        // user.setName("Mike");
        // user.setEmail("mike@gmail.com");
        // user.setPassword("pass1234");
        // user.setProfile(profile);
        // em.persist(user);

        // one to many / many to one relation
        // Department dept = new Department();
        // dept.setName("IT");
        // Employee e = new Employee();
        // e.setName("John");
        // e.setSalary(4000);
        // dept.addEmplyee(e);
        // em.persist(dept);

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> product = cq.from(Product.class);
        cq.select(product);
        List<Product> list = em.createQuery(cq).getResultList();
        list.forEach(System.out::println);
    

        tx.commit();
        em.close();
        emf.close();

    }
}