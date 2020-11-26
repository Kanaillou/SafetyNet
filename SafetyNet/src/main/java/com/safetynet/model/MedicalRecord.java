/**
 * 
 */
package com.safetynet.model;

/**
 * @author Quentin
 *
 */

//"medicalrecords": [{ "firstName":"John", "lastName":"Boyd", "birthdate":"03/06/1984", "medications"

public class MedicalRecord {

	private String firstName;
	
	private String lastName;
	
	private String birthdate;
	
	private String[] medications;
	
	private String[] allergies ;
	
public MedicalRecord ( ) {
		
		
		this.firstName = firstName ;
		this.birthdate = birthdate;
		this.lastName = lastName;
		this.medications = medications ;
		this.allergies  = allergies ;
}


public String[] getAllergies() {
	return allergies;
}


public void setAllergies(String[] allergies) {
	this.allergies = allergies;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getBirthdate() {
	return birthdate;
}


public void setBirthdate(String birthdate) {
	this.birthdate = birthdate;
}


public String[] getMedications() {
	return medications;
}


public void setMedications(String[] medications) {
	this.medications = medications;
}



}
	






