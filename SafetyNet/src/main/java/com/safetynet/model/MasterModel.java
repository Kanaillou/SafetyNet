/**
 * 
 */
package com.safetynet.model;

import java.util.List;

/**
 * @author Quentin
 *
 */
public class MasterModel {
	
	private List<Persons> persons;

	private List<FireStations> firestations;

	private List<MedicalRecord> medicalrecords;

	public MasterModel(List<Persons> persons, List<FireStations> firestations, List<MedicalRecord> medicalrecords) {
		this.persons = persons;
		this.firestations = firestations;
		this.medicalrecords = medicalrecords;
	}

	public List<Persons> getPersons() {
		return persons;
	}

	public void setPersons(List<Persons> persons) {
		this.persons = persons;
	}

	public List<FireStations> getFirestations() {
		return firestations;
	}

	public void setFirestations(List<FireStations> firestations) {
		this.firestations = firestations;
	}

	public List<MedicalRecord> getMedicalrecords() {
		return medicalrecords;
	}

	public void setMedicalrecords(List<MedicalRecord> medicalrecords) {
		this.medicalrecords = medicalrecords;
	}

}
