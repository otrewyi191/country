package com.zzx.country.repositories;

import com.zzx.country.entites.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CountryRepositories extends JpaRepository<Country,Integer> {

}
