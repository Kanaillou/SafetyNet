/**
 * 
 */
package com.safetynet.model;

import java.util.List;

/**
 * @author Quentin
 *
 */
public class Fires {private List <String> stations;
private List <Persons> persons;

public Fires(List<String> stations, List<Persons> persons) {
	super();
	this.stations = stations;
	this.persons = persons;
}

public List<String> getStations() {
	return stations;
}
public void setStations(List<String> stations) {
	this.stations = stations;
}
public List<Persons> getPersons() {
	return persons;
}
public void setPersons(List<Persons> persons) {
	this.persons = persons;
}

@Override
public String toString() {
	return "Fire [stations=" + stations + ", persons=" + persons + "]";
}

}
