
package com.safetynet.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.safetynet.model.ChildAlert;
import com.safetynet.model.MasterModel;
import com.safetynet.model.Persons;
import com.safetynet.service.ChildAlertService;

import Utils.Util;

import java.util.List;

@RequestMapping("/childAlert")
@RestController


public class ChildAlertController {@Autowired
	MasterModel model;
	
	@Autowired
	Util util;

	@Autowired
	private ChildAlertService childAlertService;

	private static final Logger logger = LogManager.getRootLogger();

	@GetMapping("")
	public ChildAlert getChildsFromAdress(@RequestParam String address) throws Exception {
		List<Persons> listPersons = util.getPersonsFromAdress(address);
		List<Persons> listChilds = childAlertService.getChildsFromListOfPersons(listPersons);
		ChildAlert childAlert = childAlertService.getChildsAndMembersFamily(listChilds, listPersons);
		logger.info("Request = @RequestBody = {}", address);
		logger.info("Response {}", childAlert.toString());
		
		return childAlert;

	}
}


