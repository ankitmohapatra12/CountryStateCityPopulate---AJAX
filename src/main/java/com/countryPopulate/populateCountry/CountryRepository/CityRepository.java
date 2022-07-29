package com.countryPopulate.populateCountry.CountryRepository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.countryPopulate.populateCountry.Models.City;
import com.countryPopulate.populateCountry.Models.CityEntity;



@Repository("cityRepository")
public interface CityRepository extends CrudRepository<City, Integer> {

	@Query("select new com.countryPopulate.populateCountry.Models.CityEntity(id, name) from City where stateId = :id")
	public List<CityEntity> findByState(@Param("id") int id);

}