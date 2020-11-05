/**
 * 
 */
package com.safetynet.service;

import java.util.Iterator;
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
public class PersonService {
	
	@Autowired
	private MasterModel model;

	public PersonService(MasterModel model2) {
		 this.model = model2;
	}


	public List<Persons> update(Persons person) {
		String firstname = person.getFirstName();
		String lastName = person.getLastName();

		List<Persons> listPersons = model.getPersons();

		for (Persons p : listPersons) {
			// suppose that firstname and lastname can not changed
			if (p.getFirstName().equals(firstname) && p.getLastName().equals(lastName)) {
				p.setAddress(person.getAddress());
				p.setCity(person.getCity());
				p.setZip(person.getZip());
				p.setPhone(person.getPhone());
				p.setEmail(person.getEmail());
			}
		}
		return listPersons;

	}

	public List<Persons> add(Persons person) {
		List<Persons> listPersons = model.getPersons();
		listPersons.add(person);
		return listPersons;

	}

	public List<Persons> delete(String firstName, String lastName) {
		List<Persons> listPersons = model.getPersons();
		Iterator<Persons> it = listPersons.iterator();
		
		while (it.hasNext()) {
			// use a combinaison of firstname and lastname for id
			Persons person = it.next();
			if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
				it.remove();
			}
		
		}
		return listPersons;
	}

}
