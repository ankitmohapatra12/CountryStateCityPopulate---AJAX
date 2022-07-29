package com.countryPopulate.populateCountry.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.countryPopulate.populateCountry.CountryRepository.CityRepository;
import com.countryPopulate.populateCountry.Models.CityEntity;



@Service("cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<CityEntity> findByState(int id) {
		return cityRepository.findByState(id);
	}

}