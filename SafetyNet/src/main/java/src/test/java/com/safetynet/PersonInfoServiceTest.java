/*
package src.test.java.com.safetynet;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import Utils.Util;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.safetynet.model.MasterModel;
import com.safetynet.model.MedicalRecord;
import com.safetynet.model.PersonInfo;
import com.safetynet.model.Persons;
import com.safetynet.service.PersonInfoService;
import com.safetynet.service.PersonService;

public class PersonInfoServiceTest {private static PersonInfoService personInfoService;

private static MasterModel model;

private static Util util;

@BeforeAll
private static void setUp() {
	 model = mock(Model.class);
	 util = mock(Util.class);
	 personInfoService = new PersonInfoService(model, util);
}

@Test
 public void testGetPersonByFirstNameAndLastName () throws Exception {
	List<Persons> listPersons = new ArrayList<>();
	Persons person1 = new Persons();
	person1.setFirstName("John");
	person1.setLastName("Boyd");
	person1.setAddress("1509 Culver St");

	listPersons.add(person1);
	
	Persons person2 = new Persons();
	person2.setFirstName("Jacob");
	person2.setLastName("Boyd");
	person2.setAddress("1509 Culver St");

	listPersons.add(person2);

	Persons person3 = new Persons();
	person3.setFirstName("Tenley");
	person3.setLastName("Boyd");
	person3.setAddress("1509 Culver St");

	listPersons.add(person3);
	
	Persons person4 = new Persons();
	person4.setFirstName("Roger");
	person4.setLastName("Boyd");
	person4.setAddress("1509 Culver St");

	listPersons.add(person4);
	
	Persons person5 = new Persons();
	person5.setFirstName("Felicia");
	person5.setLastName("Boyd");
	person5.setAddress("1509 Culver St");

	listPersons.add(person5);
	
	Persons person6 = new Persons();
	person6.setFirstName("Allison");
	person6.setLastName("Boyd");
	person6.setAddress("112 Steppes Pl");

	listPersons.add(person6);
	
	Persons person7 = new Persons();
	person7.setFirstName("Jonanathan");
	person7.setLastName("Marrack");
	person7.setAddress("29 15th St");

	listPersons.add(person7);
	
	assertEquals(7, listPersons.size());
	
	when(model.getPersons()).thenReturn(listPersons);
	PersonInfo personInformation = personInfoService.getPersonByFirstNameAndLastName(person2.getFirstName(), person2.getLastName());

	assertEquals(person2.getFirstName(), personInformation.getPerson().getFirstName());
	assertEquals(5, personInformation.getPersonsWithSameLastName().size());
}

@Test
 public void testGetPersonsInformationsByFirstNameAndLastName () throws Exception {
	List<Persons> listPersons = new ArrayList<>();
	Persons person1 = new Persons();
	person1.setFirstName("John");
	person1.setLastName("Boyd");
	person1.setAddress("1509 Culver St");
	person1.setCity("Culver");
	person1.setZip("97451");
	person1.setPhone("841-874-6512");
	person1.setEmail("jaboyd@email.com");
	
	listPersons.add(person1);
	
	Persons person2 = new Persons();
	person2.setFirstName("Jacob");
	person2.setLastName("Boyd");
	person2.setAddress("1509 Culver St");
	person2.setCity("Culver");
	person2.setZip("97451");
	person2.setPhone("841-874-6513");
	person2.setEmail("drk@email.com" );


	Persons person3 = new Persons();
	person3.setFirstName("Tenley");
	person3.setLastName("Boyd");
	person3.setAddress("1509 Culver St");
	person3.setCity("Culver");
	person3.setZip("97451");
	person3.setPhone("841-874-6512");
	person3.setEmail("tenz@email.com");

	listPersons.add(person3);
	
	Persons person4 = new Persons();
	person4.setFirstName("Roger");
	person4.setLastName("Boyd");
	person4.setAddress("1509 Culver St");
	person4.setCity("Culver");
	person4.setZip("97451");
	person4.setPhone("841-874-6512");
	person4.setEmail("jaboyd@email.com");
		
	listPersons.add(person4);
	
	Persons person5 = new Persons();
	person5.setFirstName("Felicia");
	person5.setLastName("Boyd");
	person5.setAddress("1509 Culver St");
	person5.setCity("Culver");
	person5.setZip("97451");
	person5.setPhone("841-874-6544");
	person5.setEmail("jaboyd@email.com");

	listPersons.add(person5);
	
	Persons person6 = new Persons();
	person6.setFirstName("Allison");
	person6.setLastName("Boyd");
	person6.setAddress("112 Steppes Pl");
	person6.setCity("Culver");
	person6.setZip("97451");
	person6.setPhone("841-874-9888");
	person6.setEmail("aly@imail.com");
	
	listPersons.add(person6);
	
	PersonInfo personInformation = new PersonInfo(listPersons, 0, listPersons, 0);
	personInformation.setPerson(person2);
	personInformation.setPersonsWithSameLastName(listPersons);
	
	List<MedicalRecord> listMedicalrecords = new ArrayList<>();
	
	MedicalRecord medicalrecord1 = new MedicalRecord(null, null, null, null);
	medicalrecord1.setFirstName("John");
	medicalrecord1.setLastName("Boyd");
	medicalrecord1.setBirthdate("03/06/1984");
	String[] allergies = {"nillacilan"};
	medicalrecord1.setAllergies(allergies);
	String[] medications = {"aznol:350mg", "hydrapermazol:100mg"};
	medicalrecord1.setMedications(medications);
	
	listMedicalrecords.add(medicalrecord1);
	
	MedicalRecord medicalrecord2 = new MedicalRecord(null, null, null, medications);
	medicalrecord2.setFirstName("Jacob");
	medicalrecord2.setLastName("Boyd");
	medicalrecord2.setBirthdate("03/06/1989");
	String[] allergies2 = {""};
	medicalrecord2.setAllergies(allergies2);
	String[] medications2 = {"pharmacol:5000mg", "terazine:10mg", "noznazol:250mg"};
	medicalrecord2.setMedications(medications2);
	
	listMedicalrecords.add(medicalrecord2);
	
	MedicalRecord medicalrecord3 = new MedicalRecord(null, null, null, medications2);
	medicalrecord3.setFirstName("Tenley");
	medicalrecord3.setLastName("Boyd");
	medicalrecord3.setBirthdate("02/18/2012");
	String[] allergies3 = {"peanut"};
	medicalrecord3.setAllergies(allergies3);
	String[] medications3 = {""};
	medicalrecord3.setMedications(medications3);
	
	listMedicalrecords.add(medicalrecord3);
	
	MedicalRecord medicalrecord4 = new MedicalRecord(null, null, null, medications3);
	medicalrecord4.setFirstName("Roger");
	medicalrecord4.setLastName("Boyd");
	medicalrecord4.setBirthdate("09/06/2017");
	String[] allergies4 = {""};
	medicalrecord4.setAllergies(allergies4);
	String[] medications4 = {""};
	medicalrecord4.setMedications(medications4);
	
	listMedicalrecords.add(medicalrecord4);
	
	MedicalRecord medicalrecord5 = new MedicalRecord(null, null, null, medications4);
	medicalrecord5.setFirstName("Felicia");
	medicalrecord5.setLastName("Boyd");
	medicalrecord5.setBirthdate("01/08/1986");
	String[] allergies5 = {"xilliathal"};
	medicalrecord5.setAllergies(allergies5);
	String[] medications5 = {"tetracyclaz:650mg"};
	medicalrecord5.setMedications(medications5);
	
	listMedicalrecords.add(medicalrecord5);
	
	MedicalRecord medicalrecord6 = new MedicalRecord(null, null, null, medications5);
	medicalrecord6.setFirstName("Allison");
	medicalrecord6.setLastName("Boyd");
	medicalrecord6.setBirthdate("03/15/1965");
	String[] allergies6 = {"nillacilan"};
	medicalrecord6.setAllergies(allergies6);
	String[] medications6 = {"aznol:200mg"};
	medicalrecord6.setMedications(medications6);
	
	listMedicalrecords.add(medicalrecord6);
	
	MedicalRecord medicalrecord7 = new MedicalRecord(null, null, null, medications6);
	medicalrecord7.setFirstName("Zach");
	medicalrecord7.setLastName("Zemicks");
	medicalrecord7.setBirthdate("03/06/2017");
	String[] allergies7 = {""};
	medicalrecord7.setAllergies(allergies7);
	String[] medications7 = {""};
	medicalrecord7.setMedications(medications7);
	
	listMedicalrecords.add(medicalrecord7);
	
	when(model.getMedicalrecords()).thenReturn(listMedicalrecords);
	when(util.calculAge(Mockito.anyString())).thenCallRealMethod();
	
	PersonInfo personInformationResult= personInfoService.getPersonsInformationsByFirstNameAndLastName(personInformation);
	assertNotNull(personInformationResult);
	assertEquals(person2.getFirstName(), personInformationResult.getPerson().getFirstName());
	assertNotNull(personInformationResult.getPerson().getAge());
	assertEquals(5, personInformation.getPersonsWithSameLastName().size());
}

}*/
