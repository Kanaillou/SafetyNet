/*
package com.safetynet.controller;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.safetynet.model.Fires;
import com.safetynet.model.MasterModel;
import com.safetynet.model.Persons;
import com.safetynet.service.FireService;

import Utils.Util;

@RequestMapping("/fire")
@RestController



public class FireController {

	@Autowired
	MasterModel model;
	
	@Autowired
	Util util;

	@Autowired
	private FireService fireService;
	
	private static final Logger logger = LogManager.getRootLogger();

	@GetMapping("")
	public Fires getPersonAndStationNumberByAddress(@RequestParam String address) throws Exception {
		List<Persons> listPersonsFromAddress = util.getPersonsFromAdress(address);
		List<Persons> listPersonWithMedicationsAndAllergies = util
				.getPersonWithMedicationsAndAllergies(listPersonsFromAddress);
		Fires fire = fireService
				.getPersonAndStationNumberByAddress(listPersonWithMedicationsAndAllergies);
		logger.info("Request = @RequestBody = {}", address);
		logger.info("Response {}", fire);
		return fire;

	}
}
*/

