/*
package com.safetynet.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.safetynet.model.PersonInfo;
import com.safetynet.service.PersonInfoService;

@RequestMapping("/personInfo")
@RestController
public class PersonInfoController {

	private static final Logger logger = LogManager.getRootLogger();

	@Autowired
	private PersonInfoService personInfoService;

	@GetMapping("")
	public PersonInfo getPersonsInformationsByFirstNameAndLastName(@RequestParam String firstName,
			@RequestParam String lastName) {
		PersonInfo personInfo = personInfoService.getPersonByFirstNameAndLastName(firstName, lastName);
		PersonInfo personAndPersonsWithSameLastName = personInfoService.getPersonsInformationsByFirstNameAndLastName(personInfo);
		logger.info("Request = @RequestParam = {} + {}", firstName, lastName);
		logger.info("Response {}", personAndPersonsWithSameLastName);
		return personAndPersonsWithSameLastName;

	}
}
*/