package com.example.entity;

import org.hibernate.engine.internal.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import org.mindrot.jbcrypt.BCrypt;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "user_seq", initialValue = 1001001, allocationSize = 1)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role = "user";
    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;

    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        // this.password = password;
        setPassword(password);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    // public void setPassword(String password) {
    // this.password = password;
    // }

    public void setPassword(String password) {
        // hash before saving to DB
        this.password = BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
                + "]";
    }

}
