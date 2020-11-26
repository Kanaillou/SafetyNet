/**
 * 
 */
package com.safetynet.model;

/**
 * @author Quentin
 *
 */
import java.util.List;

public class PersonInfo {

	private int nbAdults;
	private List<Persons> adults;
	private int nbChilds;
	private List<Persons> childs;

	public PersonInfo() {
		this.nbAdults = nbAdults;
		this.adults = adults;
		this.nbChilds = nbChilds;
		this.childs = childs;
	}

	public List<Persons> getAdults() {
		return adults;
	}

	public void setAdults(List<Persons> adults) {
		this.adults = adults;
	}

	public List<Persons> getChilds() {
		return childs;
	}

	public void setChilds(List<Persons> childs) {
		this.childs = childs;
	}

	public int getNbAdults() {
		return nbAdults;
	}

	public void setNbAdults(int nbAdults) {
		this.nbAdults = nbAdults;
	}

	public int getNbChilds() {
		return nbChilds;
	}

	public void setNbChilds(int nbChilds) {
		this.nbChilds = nbChilds;
	}

	@Override
	public String toString() {
		return "PersonInfo [nbAdults=" + nbAdults + ", adults=" + adults + ", nbChilds=" + nbChilds + ", childs="
				+ childs + "]";
	}

	public void setPersons(Persons person) {
		// TODO Auto-generated method stub
		
	}

	
	}

	

	


