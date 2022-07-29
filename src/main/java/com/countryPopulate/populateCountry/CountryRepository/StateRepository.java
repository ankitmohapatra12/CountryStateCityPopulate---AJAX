package com.countryPopulate.populateCountry.CountryRepository;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.countryPopulate.populateCountry.Models.State;
import com.countryPopulate.populateCountry.Models.StateEntity;

@Repository("stateRepository")
public interface StateRepository extends CrudRepository<State, Integer> {
	@Query("select new com.countryPopulate.populateCountry.Models.StateEntity(id, name) from State where countryId = :id")
	public List<StateEntity> findByCountry(@Param("id") int id);

}