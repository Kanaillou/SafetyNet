/**
 * 
 
package com.safetynet.service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import Utils.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safetynet.model.ChildAlert;
import com.safetynet.model.MasterModel;
import com.safetynet.model.MedicalRecord;
import com.safetynet.model.PersonInfo;
import com.safetynet.model.Persons;

 * @author Quentin
 *
 
@Service
public class ChildAlertService {

	@Autowired
	private MasterModel model;

	@Autowired
	private Util util;

	public ChildAlertService(MasterModel model2, Util util2) {
		this.model = model2;
		this.util = util2;
	}

	public List<Persons> getChildsFromListOfPersons(List<Persons> listPersons) throws Exception {
		if (listPersons == null) {
			throw new Exception("list is empty");
		}
		List<Persons> listChilds = new ArrayList<>();
		List<MedicalRecord> listMedicalRecord = model.getMedicalrecords();
		for (Persons person : listPersons) {
			for (MedicalRecord mr : listMedicalRecord) {
				if (person.getFirstName().equals(mr.getFirstName()) && person.getLastName().equals(mr.getLastName())) {
					long age = util.calculAge(mr.getBirthdate());
					person.setAge(String.valueOf(age));
					if (age <= 18) {
						Persons child = new Persons(person.getFirstName(), person.getLastName(), person.getAge());
						listChilds.add(child);
					}
				}
			}
		}
		return listChilds;
	}

	public ChildAlert getChildsAndMembersFamily(List<Persons> listChilds, List<Persons> listPersons) {
		List<Persons> listMembersOfFamily = new ArrayList<>();
		List<PersonInfo> listPersonsWithoutDuplicates = new ArrayList<>();

		if (!listChilds.isEmpty()) {
			for (Persons child : listChilds) {
				Iterator<Persons> itr = listPersons.iterator();
				while (itr.hasNext()) {
					Persons person = itr.next();
					if (person.getFirstName().equals(child.getFirstName())
							&& person.getLastName().equals(child.getLastName())) {
						itr.remove();
					}
				}
			}
			for (Persons child : listChilds) {
				for (Persons person : listPersons) {
					if (person.getLastName().equals(child.getLastName())) {
						listMembersOfFamily.add(person);
					}
				}
			}
			listPersonsWithoutDuplicates = listMembersOfFamily.stream().distinct().map(Persons.class::cast).collect(Collectors.toList());
		} else {
			listPersonsWithoutDuplicates.clear();
		}
		return new ChildAlert(listChilds,listPersonsWithoutDuplicates);
	}

}
*/