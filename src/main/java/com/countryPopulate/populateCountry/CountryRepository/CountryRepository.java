package com.countryPopulate.populateCountry.CountryRepository;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.countryPopulate.populateCountry.Models.Country;



@Repository("countryRepository")
public interface CountryRepository extends CrudRepository<Country, Integer> {

}