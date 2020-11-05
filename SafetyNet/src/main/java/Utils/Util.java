package Utils;
/*
 * 
 


import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safetynet.model.FireStations;
import com.safetynet.model.MasterModel;
import com.safetynet.model.MedicalRecord;
import com.safetynet.model.Persons;

@Service
public class Util {

	@Autowired
	private MasterModel model;

	

	public Util() {

	}

	public long calculAge(String date) {
		if (date == null) {
			throw new NullPointerException("le parametre d'entre ne peut pas etre null");
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate birthDate = LocalDate.parse(date, formatter);
		long difference = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
		return difference;
	}

	public List<Persons> getPersonsFromAdress(String address) throws Exception {
		List<Persons> listPersons = model.getPersons();
		List<Persons> listPersonsFromAddress = new ArrayList<>();
		if (address == null || address.isEmpty()) {
			throw new Exception("address is empty or null");
		}
		for (Persons person : listPersons) {
			if (person.getAddress().equalsIgnoreCase(address)) {
				listPersonsFromAddress.add(person);
			}
		}
		return listPersonsFromAddress;
	}
	
	public List<Persons> getPersonsFromAddressStation(List<String> listAddress) {
		List<Persons> listPersonInfo = new ArrayList<>();
		List<Persons> listPerson = model.getPersons();
		for (String address : listAddress) {
			for (Persons person : listPerson) {
				if (person.getAddress().contains(address)) {
					listPersonInfo.add(person);
				}
			}
		}
		return listPersonInfo;
	}
	
	public List<Persons> getPersonWithMedicationsAndAllergies(List<Persons> listPersons) {
		List<MedicalRecord> listMedicalRecord = model.getMedicalrecords();
		List<Persons> listPersonWithMedicationsAndAllergies = new ArrayList<>();
		for (Persons person : listPersons) {
			for (MedicalRecord mr : listMedicalRecord) {
				if (person.getFirstName().equals(mr.getFirstName()) && person.getLastName().equals(mr.getLastName())) {
					long age = calculAge(mr.getBirthdate());
					String[] medications = mr.getMedications();
					String[] allergies = mr.getAllergies();
					person.setAge(String.valueOf(age));
					person.setAllergies(allergies);
					person.setMedications(medications);
					listPersonWithMedicationsAndAllergies.add(person);
				}
			}
		}
		return listPersonWithMedicationsAndAllergies;
	}
	
	public List<String> getAddressStationsFromStationNumber(int stationNumber) {
		List<FireStations> listFirestation = model.getFirestations();
		List<String> address = new ArrayList<>();
		for (FireStations firestation : listFirestation) {
			if (firestation.getStation()==(stationNumber) && !address.contains(firestation.getAddress())) {
				address.add(firestation.getAddress());
			}
		}
		return address;
	}

}
*/