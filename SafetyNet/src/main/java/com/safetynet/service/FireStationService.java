
package com.safetynet.service;


 
 


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safetynet.model.FireStations;
import com.safetynet.model.Flood;
import com.safetynet.model.MasterModel;
import com.safetynet.model.MedicalRecord;
import com.safetynet.model.PersonInfo;
import com.safetynet.model.Persons;

import Utils.Util;
public class FireStationService {
	@Autowired
	private MasterModel model;

	
	private Util util;

	

	
	public PersonInfo getPersons(List<Persons> listPersonInfo) {
		Integer nbAdults = 0;
		Integer nbChilds = 0;
		List<Persons> listAdults = new ArrayList<>();
		List<Persons> listChilds = new ArrayList<>();
		List<MedicalRecord> listMedicalRecord = model.getMedicalrecords();
		for (Persons person : listPersonInfo) {
			for (MedicalRecord mr : listMedicalRecord) {
				if (person.getFirstName().equals(mr.getFirstName()) && person.getLastName().equals(mr.getLastName())) {
					Long age = util.calculAge(mr.getBirthdate());
					if (age >= 18) {
						nbAdults++;
						Persons adult = new Persons();
						adult.setFirstName(person.getFirstName());
						adult.setLastName(person.getLastName());
						adult.setAddress(person.getAddress());
						adult.setPhone(person.getPhone());
						listAdults.add(adult);

					} else {
						nbChilds++;
						Persons child = new Persons();
						child.setFirstName(person.getFirstName());
						child.setLastName(person.getLastName());
						child.setAddress(person.getAddress());
						child.setPhone(person.getPhone());
						listChilds.add(child);
					}
				}
			}
		}

		return new PersonInfo();
	}

	public List<FireStations> add(FireStations firestation) {
		List<FireStations> listFirestations = model.getFirestations();
		listFirestations.add(firestation);
		return listFirestations;

	}

	public List<FireStations> update(FireStations firestation) {

		String address = firestation.getAddress();
		int station = firestation.getStation();
		List<FireStations> listFirestations = model.getFirestations();

		for (FireStations fs : listFirestations) {
			if (fs.getAddress().equals(address)) {
				fs.setStation(station);
			}
		}
		return listFirestations;
	}

	public List<FireStations> delete(FireStations firestation) {
		List<FireStations> listFirestations = model.getFirestations();
		Iterator<FireStations> it = listFirestations.iterator();

		String address = firestation.getAddress();

		while (it.hasNext()) {
			FireStations fs = it.next();
			if (fs.getAddress().equals(address)) {
				it.remove();
			}
		}
		return listFirestations;
	}

}
