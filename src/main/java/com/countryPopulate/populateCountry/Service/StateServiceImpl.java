package com.countryPopulate.populateCountry.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.countryPopulate.populateCountry.CountryRepository.StateRepository;
import com.countryPopulate.populateCountry.Models.StateEntity;



@Service("stateService")
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;

	@Override
	public List<StateEntity> findByCountry(int id) {
		return stateRepository.findByCountry(id);
	}

}