package com.zzx.country.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {

        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    private String capital;
}
