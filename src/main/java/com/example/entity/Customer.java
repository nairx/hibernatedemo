package com.example.entity;
import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "cust_seq", initialValue = 10000, allocationSize = 1) 
    private Long id;
    private String name;
    public Customer(){
    }
    public Customer(String name){
        this.name=name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}
