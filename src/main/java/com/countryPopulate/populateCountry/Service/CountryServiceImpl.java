package com.countryPopulate.populateCountry.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.countryPopulate.populateCountry.CountryRepository.CountryRepository;
import com.countryPopulate.populateCountry.Models.Country;



@Service("countryService")
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Iterable<Country> findAll() {
		return countryRepository.findAll();
	}

	@Override
	public Country find(int id) {
		return countryRepository.findById(id).get();
	}

}