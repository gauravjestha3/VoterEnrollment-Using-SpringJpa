package com.example.voter.controller;
import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.voter.model.CityMV;
import com.example.voter.model.ConstituencyMV;
import com.example.voter.model.StateMV;
import com.example.voter.model.WardMV;
import com.example.voter.service.MasterService;

/**
 * @author gaurav
 *
 */
@RestController
@RequestMapping("/master")
public class MasterController {
	private static final Logger log = LoggerFactory.getLogger(MasterController.class);

	@Autowired
	private MasterService masterService;

	/***
	 * API to retrieve all states
	 */
	@GetMapping("/states")
	public List<StateMV> getAllStates() {
		log.info("entered controller");
		
		
		return masterService.getAllStates();
	}

	/***
	 * API to retrieve all cities for a particular state
	 */
	@GetMapping("/state/{stateId}/cities")
	public List<CityMV> getAllCities(@PathVariable Long stateId) {
		log.info("entered controller");
		return masterService.getAllCities(stateId);
	}

	/***
	 * API to retrieve all constituencies for a particular city
	 */
	@GetMapping("/city/{cityId}/constituencies")
	public List<ConstituencyMV> getAllConstituencies(@PathVariable Long cityId) {
		log.info("entered controller");
		return masterService.getAllConstituencies(cityId);
	}

	/***
	 * API to retrieve all wards for a particular constituency
	 */
	@GetMapping("/constituency/{constituencyId}/wards")
	public List<WardMV> getAllWards(@PathVariable Long constituencyId) {
		log.info("entered controller");
		return masterService.getAllWards(constituencyId);
	}


}
