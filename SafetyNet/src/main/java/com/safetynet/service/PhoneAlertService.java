/**
 * 
 */
package com.safetynet.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safetynet.model.MasterModel;
import com.safetynet.model.Persons;
/**
 * @author Quentin
 *
 */
@Service
public class PhoneAlertService {

	@Autowired
	private MasterModel model;

	public PhoneAlertService(MasterModel model2) {
		this.model=	model2;
	}


	public List<String> getPhoneNumberByFirestationNumber(List<String> listAddress) {
		List<String> listPhoneNumber = new ArrayList<>();
		List<Persons> listPerson = model.getPersons();
		for (String address : listAddress) {
			for (Persons person : listPerson) {
				if (person.getAddress().contains(address) && !listPhoneNumber.contains(person.getPhone())) {

					listPhoneNumber.add(person.getPhone());
				}
			}
		}
		// return distinct phone numbers
		return listPhoneNumber;
	}
	
}

