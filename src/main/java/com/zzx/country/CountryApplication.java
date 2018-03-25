package com.zzx.country;

import com.zzx.country.entites.Country;
import com.zzx.country.repositories.CountryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryApplication implements CommandLineRunner{

    @Autowired
    private CountryRepositories countryRepositories;

	public static void main(String[] args) {
		SpringApplication.run(CountryApplication.class, args);
	}

	@Override
    public void run(String... args) throws  Exception{
        countryRepositories.save(new Country("Earth","World"));
        countryRepositories.save(new Country("China","Peking"));
        countryRepositories.save(new Country("Germany","Berlin"));
        countryRepositories.save(new Country("USA","Washington DC"));
        countryRepositories.save(new Country("Russia","Moscow"));
        countryRepositories.save(new Country("India","New Delhi"));

        countryRepositories.save(new Country("Namibia","Windhoek"));
        countryRepositories.save(new Country("North Korea","Pyongyang"));
        countryRepositories.save(new Country("Kenya","Nairobi"));
        countryRepositories.save(new Country("Canada","Ottawa"));
        countryRepositories.save(new Country("Jamaica","Kingston"));
        countryRepositories.save(new Country("Brazil","Brazilia"));

        countryRepositories.save(new Country("Egypt","Cairo"));
        countryRepositories.save(new Country("Nigeria","Abuja"));


    }
}
