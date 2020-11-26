package com.safetynet.model;

import java.util.List;

public class PersonInformation {
	
	private Persons person;
	private List<Persons> personsWithSameLastName;
		
	public PersonInformation(Persons person, List<Persons> personsWithSameLastName) {
		this.person = person;
		this.personsWithSameLastName = personsWithSameLastName;
	}

	public PersonInformation() {
		
	}

	public Persons getPerson() {
		return person;
	}
	public void setPerson(Persons person) {
		this.person = person;
	}
	public List<Persons> getPersonsWithSameLastName() {
		return personsWithSameLastName;
	}
	public void setPersonsWithSameLastName(List<Persons> personsWithSameLastName) {
		this.personsWithSameLastName = personsWithSameLastName;
	}
	@Override
	public String toString() {
		return "PersonInformation [person=" + person + ", personsWithSameLastName=" + personsWithSameLastName + "]";
	}
	
	
}
