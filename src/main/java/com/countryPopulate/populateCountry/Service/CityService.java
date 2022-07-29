package com.countryPopulate.populateCountry.Service;


import java.util.List;

import com.countryPopulate.populateCountry.Models.CityEntity;

public interface CityService {

	public List<CityEntity> findByState(int id);

}