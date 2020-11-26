/**
 * 
 */
package com.safetynet.model;

/**
 * @author Quentin
 *
 */


public class FireStations {

	private String address;
	private int station;
	
	
	public FireStations (String address , int station) {
		
		this.address =address ;
		this.station=station;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getStation() {
		return station;
	}


	public void setStation(int station) {
		this.station = station;
	}
	
	

}
