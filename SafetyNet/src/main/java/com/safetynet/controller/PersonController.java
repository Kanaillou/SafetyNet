package com.safetynet.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.safetynet.model.MasterModel;
import com.safetynet.model.Persons;
import com.safetynet.service.PersonService;

@RequestMapping("/person")
@RestController
public class PersonController {

	@Autowired
	MasterModel model;

	private static final Logger logger = LogManager.getRootLogger();

	@Autowired
	private PersonService personService;


	@PostMapping("/add")
	public List<Persons> addPerson(@RequestBody Persons person) {
		List<Persons> listPerson = this.personService.add(person);
		logger.info("Request = @RequestBody = {}", person);
		logger.info("Response {}", listPerson);
		
		return listPerson;
	}

	@PutMapping("/update")
	public List<Persons> updatePerson(@RequestBody Persons person) {
		List<Persons> listPerson = personService.update(person);
		logger.info("Request = @RequestBody = {}", person);
		logger.info("Response ={}", listPerson);

		return listPerson;

	}

	@DeleteMapping("/delete")
	public List<Persons> deletePerson(@RequestParam String firstName, @RequestParam String lastName) {
		List<Persons> listPersons = personService.delete(firstName, lastName);
		logger.info("Request = @RequestParam = {} + {}", firstName, lastName);
		logger.info("Response ={}", listPersons);

		return listPersons;
	}

}