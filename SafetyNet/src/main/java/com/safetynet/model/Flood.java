/**
 * 
 */
package com.safetynet.model;

import java.util.List;

/**
 * @author Quentin
 *
 */
public class Flood {
	

		private String address;
		private List <Persons> persons;
		
		public Flood(String address, List<Persons> persons) {
			this.address = address;
			this.persons = persons;
		}
		
		/**
		 * @param address2
		 * @param listPersonsByAddress
		 */
	

		/**
		 * @param address2
		 * @param listPersonsByAddress
		 */
	
		

	
		

		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public List<Persons> getPersons() {
			return persons;
		}
		public void setPersons(List<Persons> persons) {
			this.persons = persons;
		}

		@Override
		public String toString() {
			return "Flood [address=" + address + ", persons=" + persons + "]";
		}
		

}
