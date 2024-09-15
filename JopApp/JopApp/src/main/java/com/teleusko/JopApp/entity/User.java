package com.teleusko.JopApp.entity;

import java.util.List;

public class User {
    private int id;

    private String name;

    private List<String> favouriteLanguage;

    private String gender;

    private String country;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(List<String> favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", favouriteLanguage=" + favouriteLanguage +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
