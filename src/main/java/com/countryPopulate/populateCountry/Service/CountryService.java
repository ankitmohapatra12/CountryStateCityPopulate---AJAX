package com.countryPopulate.populateCountry.Service;

import com.countryPopulate.populateCountry.Models.Country;

public interface CountryService {

	public Iterable<Country> findAll();

	public Country find(int id);

}