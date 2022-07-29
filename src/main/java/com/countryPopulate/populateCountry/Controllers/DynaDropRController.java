package com.countryPopulate.populateCountry.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.countryPopulate.populateCountry.Service.CityService;
import com.countryPopulate.populateCountry.Service.CountryService;
import com.countryPopulate.populateCountry.Service.StateService;
import com.google.gson.Gson;

@Controller
public class DynaDropRController {

	@Autowired
	private CountryService countryService;

	@Autowired
	private StateService stateService;

	@Autowired
	private CityService cityService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		System.out.println("hi");
		modelMap.put("countries", countryService.findAll());
		return "Register";
	}

	@ResponseBody
	@RequestMapping(value = "getStates/{countryId}", method = RequestMethod.GET)
	public String loadStatesByCountry(@PathVariable("countryId") int countryId) {
		System.out.println("h1");
		Gson gson = new Gson();
		return gson.toJson(stateService.findByCountry(countryId));
	}

	@ResponseBody
	@RequestMapping(value = "getCities/{stateId}", method = RequestMethod.GET)
	public String loadCitiesByState(@PathVariable("stateId") int stateId) {
		Gson gson = new Gson();
		return gson.toJson(cityService.findByState(stateId));
	}

}