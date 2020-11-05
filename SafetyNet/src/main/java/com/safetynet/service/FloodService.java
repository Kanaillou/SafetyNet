/**
 * 
 */
package com.safetynet.service;

/**
 * @author Quentin
 *
 */

	import java.util.ArrayList;
	import java.util.List;

import org.apache.logging.log4j.util.PropertySource.Util;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.safetynet.model.FireStations;
import com.safetynet.model.Flood;
import com.safetynet.model.MasterModel;
import com.safetynet.model.Persons;

	@Service
	public class FloodService {

		@Autowired
		private MasterModel model;

		@Autowired
		private Util util;

		public FloodService(MasterModel model2, Util util2) {
			 this.model = model2;
			 this.util = util2;
		}

		public List<String> getAddressStationsFromStationNumber(List<String> stations) {
			List<FireStations> listFirestation = model.getFirestations();
			List<String> listAddress = new ArrayList<>();
			for (String station : stations) {
				for (FireStations firestation : listFirestation) {
					if (station.equals(firestation.getStation()) && !listAddress.contains(firestation.getAddress())) {
						listAddress.add(firestation.getAddress());
					}
				}
			}
			return listAddress;
		}


		public List<Flood> getListPersonByAddress(List<Persons> listPersons, List<String> listAddress) {
			List<Flood> listFloods = new ArrayList<>();
			for (String address : listAddress) {
				List<Persons> listPersonsByAddress = new ArrayList<>();
				for (Persons person : listPersons) {
					if (person.getAddress().equals(address)) {
						listPersonsByAddress.add(new Persons(person.getLastName(),
								person.getPhone(), person.getAge(), person.getMedications(), person.getAllergies()));
					}
				}
				
				Flood flood = new Flood(address, listPersonsByAddress);
				listFloods.add(flood);
			}
			return listFloods;
		}

	}


