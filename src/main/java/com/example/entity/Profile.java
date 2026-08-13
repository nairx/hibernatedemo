package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Profile {
    @Id
    private int profileId;
    private String phone;
    private String city;
    private String country;
    public Profile(){

    }
    public Profile(int profileId,String phone,String city, String country){
        this.profileId=profileId,
        this.phone = phone;
        this.city = city;
        this.country = country;
    }
    public int getProfile(){
        return  profileId;
    }
    public int getProfileId() {
        return profileId;
    }
    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
}
