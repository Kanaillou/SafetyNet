
package com.safetynet.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.safetynet.model.FireStations;
import com.safetynet.model.MasterModel;
import com.safetynet.model.Persons;
import com.safetynet.model.PersonInfo;
import com.safetynet.service.FireStationService;

import Utils.Util;

@RequestMapping("/firestation")
@RestController
public class FirestationController {

	@Autowired
	MasterModel model;
	
	@Autowired
	Util util;

	@Autowired
	private FireStationService fireService;
	
	private static final Logger logger = LogManager.getRootLogger();


	@GetMapping("")
	public PersonInfo getPersonsFromNumberStation(@RequestParam int stationNumber) {

		List<String> address = util.getAddressStationsFromStationNumber(stationNumber);
		List<Persons> listPerson = util.getPersonsFromAddressStation(address);
		PersonInfo personInfo = fireService.getPersons(listPerson);
		logger.info("Request = @RequestBody = {}", stationNumber);
		logger.info("Response {}", personInfo.toString());
		return personInfo;
	}

	@PostMapping("/add")
	public List<FireStations> addFirestation(@RequestBody FireStations firestation) {
		List<FireStations> listFirestations = this.fireService.add(firestation);
		logger.info("Request = @RequestBody = {}", firestation);
		logger.info("Response {}", listFirestations);
		return listFirestations;
	}

	@PutMapping("/update")
	public List<FireStations> updateFirestation(@RequestBody FireStations firestation) {

		List<FireStations> listFirestations = fireService.update(firestation);

		logger.info("Request = @RequestBody = {}", firestation);
		logger.info("Response ={}", listFirestations);

		return listFirestations;
	}

	@DeleteMapping("/delete")
	public List<FireStations> deleteFirestation(@RequestBody FireStations firestation) {
		List<FireStations> listFirestations = fireService.delete(firestation);
		logger.info("Request = @RequestParam = {} + {}", firestation);
		logger.info("Response ={}", listFirestations);

		return listFirestations;
	}
	}
