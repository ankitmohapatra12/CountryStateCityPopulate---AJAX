package com.countryPopulate.populateCountry.Service;



import java.util.List;

import com.countryPopulate.populateCountry.Models.StateEntity;


public interface StateService {

	public List<StateEntity> findByCountry(int id);

}