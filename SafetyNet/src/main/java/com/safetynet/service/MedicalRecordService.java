/**
 * 
 */
package com.safetynet.service;

/**
 * @author Quentin
 *
 */
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safetynet.model.MasterModel;
import com.safetynet.model.MedicalRecord;

@Service
public class MedicalRecordService {

	@Autowired
	private MasterModel model;

	public MedicalRecordService(MasterModel model2) {
		 this.model = model2;
	}

	public List<MedicalRecord> add(MedicalRecord medicalrecord) {
		List<MedicalRecord> listMedicalrecords = model.getMedicalrecords();
		listMedicalrecords.add(medicalrecord);
		return listMedicalrecords;

	}

	public List<MedicalRecord> update(MedicalRecord medicalrecord) {
		String firstname = medicalrecord.getFirstName();
		String lastName = medicalrecord.getLastName();

		List<MedicalRecord> listmedicalrecords = model.getMedicalrecords();

		for (MedicalRecord mr : listmedicalrecords) {
			// suppose that firstname and lastname can not changed
			if (mr.getFirstName().equals(firstname) && mr.getLastName().equals(lastName)) {
				mr.setBirthdate(medicalrecord.getBirthdate());
				mr.setMedications(medicalrecord.getMedications());
				mr.setAllergies(medicalrecord.getAllergies());
			}
		}
		return listmedicalrecords;

	}

	public List<MedicalRecord> delete(String firstName, String lastName) {
		List<MedicalRecord> listmedicalrecords = model.getMedicalrecords();
		Iterator<MedicalRecord> it = listmedicalrecords.iterator();
		
		while (it.hasNext()) {
			// use a combinaison of firstname and lastname for id
			MedicalRecord mr = it.next();
			if (mr.getFirstName().equals(firstName) && mr.getLastName().equals(lastName)) {
				it.remove();
			}
		
		}
		return listmedicalrecords;
	}

}