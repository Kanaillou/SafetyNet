/*
 * 
 
package com.safetynet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safetynet.model.FireStations;
import com.safetynet.model.Fires;
import com.safetynet.model.MasterModel;
import com.safetynet.model.Persons;

import Utils.Util;
/**
 * @author Quentin
 *
 
@Service
public class FireService {

	
	private MasterModel model;

	@Autowired
	private Util util;

	public FireService(MasterModel model2, Util util2) {
		this.model = model2;
		this.util = util2;
	}

	public Fires getPersonAndStationNumberByAddress(List<Persons> listPersonWithMedicationsAndAllergies) {
		List<Persons> listPersonWithStationAndMedicationsAllergies = new ArrayList<>();
		List<String> listStations = new ArrayList<>();
		List<FireStations> listFirestations = model.getFirestations();
		for (Persons person : listPersonWithMedicationsAndAllergies) {
			for (FireStations firestation : listFirestations) {
				if (person.getAddress().equals(firestation.getAddress())) {
					int station = firestation.getStation();
					if (!listStations.contains(station)) {
						listStations.add(Integer.toString(station));
					}
					listPersonWithStationAndMedicationsAllergies.add(person);
				}
			}
		}
		
		
		return new Fires(listStations, listPersonWithStationAndMedicationsAllergies);
	}

}
*/