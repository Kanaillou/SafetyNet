
package src.test.java.com.safetynet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;

import com.safetynet.model.FireStations;
import com.safetynet.model.MasterModel;
import com.safetynet.model.MedicalRecord;
import com.safetynet.model.MasterModel;
import com.safetynet.model.Persons;

import Utils.Util;


public class UtilTest {
	
	  private static MasterModel model;
		
	  private static Util util;
	    
	   @BeforeAll
	    private static void setUp() {
	    	 model = mock(MasterModel.class);
	    	 //util = Util(model);
	    }

	
	 @Test
		public void testCalculAge () {

		 String date = "01/10/1987";
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		 LocalDate birthDate = LocalDate.parse(date, formatter);
		 long difference = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
		 
		 Util util = new Util();
		 long age = util.calculAge(date);
		 assertEquals(difference, age);
		}
	 
	 @Test
		public void testCalculAgeWithANullValue () {
	
		 Util util = new Util();
		 String date = null;
		  assertThrows(
				  NullPointerException.class,
		            ()->util.calculAge(date));	
		}
	 
	 @Test
	 public void testGetPersonsFromAdress () throws Exception {
		List<Persons> listPersons = new ArrayList<>();
		Persons person1 = new Persons();
		person1.setFirstName("John");
		person1.setLastName("Boyd");
		person1.setAddress("1509 Culver St");
	
		listPersons.add(person1);
		
		Persons person2 = new Persons();
		person2.setFirstName("Roger");
		person2.setLastName("Boyd");
		person2.setAddress("1509 Culver St");

		listPersons.add(person2);

		Persons person3 = new Persons();
		person3.setFirstName("Jonanathan");
		person3.setLastName("Marrack");
		person3.setAddress("29 15th St");

		listPersons.add(person3);
				
		when(model.getPersons()).thenReturn(listPersons);
		
		String address = "1509 Culver St";
		List <Persons> listPersonResult = util.getPersonsFromAdress(address);
		assertNotNull(listPersonResult);
		assertEquals(2, listPersonResult.size());
	    }
	
	@Test
	 public void testGetPersonsFromAdressWithListNull () {
		List<Persons> listPersons = new ArrayList<>();
		listPersons = null;
		
				
		when(model.getPersons()).thenReturn(listPersons);
		
		String address = "1509 Culver St";
		 assertThrows(
				  Exception.class,
		            ()->util.getPersonsFromAdress(address));
	    }
	
	@Test
	 public void testGetPersonsFromAdressWithNullValue (){
		List<Persons> listPersons = new ArrayList<>();
		Persons person1 = new Persons();
		person1.setFirstName("John");
		person1.setLastName("Boyd");
		person1.setAddress("1509 Culver St");
	
		listPersons.add(person1);
		
		Persons person2 = new Persons();
		person2.setFirstName("Roger");
		person2.setLastName("Boyd");
		person2.setAddress("1509 Culver St");

		listPersons.add(person2);

		Persons person3 = new Persons();
		person3.setFirstName("Jonanathan");
		person3.setLastName("Marrack");
		person3.setAddress("29 15th St");

		listPersons.add(person3);
				
		when(model.getPersons()).thenReturn(listPersons);
			
		String address = null;
		assertThrows(
				  Exception.class,
		            ()->util.getPersonsFromAdress(address));
	    }
	
	@Test
	 public void testGetPersonsFromAddressStation () throws Exception {
 	List<Persons> listPersons = new ArrayList<>();
		Persons person1 = new Persons();
		person1.setFirstName("Peter");
		person1.setLastName("Duncan");
		person1.setAddress("644 Gershwin Cir");
		person1.setCity("Culver");
		person1.setZip("97451");
		person1.setPhone("841-874-6512");
		person1.setEmail("jaboyd@email.com");
		String[] allergies = {"shellfish"};
		person1.setAllergies(allergies);
		String[] medications = {""};
		person1.setMedications(medications);
		
		listPersons.add(person1);
		
		Persons person2 = new Persons();
		person2.setFirstName("Reginold");
		person2.setLastName("Walker");
		person2.setAddress("908 73rd St");
		person2.setCity("Culver");
		person2.setZip("97451");
		person2.setPhone("841-874-8547");
		person2.setEmail("reg@email.com");
		String[] allergies2 = {"illisoxian"};
		person2.setAllergies(allergies2);
		String[] medications2 = {"thradox:700mg"};
		person2.setMedications(medications2);

		listPersons.add(person2);

		Persons person3 = new Persons();
		person3.setFirstName("Jamie");
		person3.setLastName("Peters");
		person3.setAddress("908 73rd St");
		person3.setCity("Culver");
		person3.setZip("97451");
		person3.setPhone("841-874-7462");
		person3.setEmail("jpeter@email.com");
		String[] allergies3 = {""};
		person3.setAllergies(allergies3);
		String[] medications3 = {""};
		person3.setMedications(medications3);
	
		listPersons.add(person3);
		
		Persons person4 = new Persons();
		person4.setFirstName("Brian");
		person4.setLastName("Stelzer");
		person4.setAddress("947 E. Rose Dr");
		person4.setCity("Culver");
		person4.setZip("97451");
		person4.setPhone("841-874-7784");
		person4.setEmail("bstel@email.com");
		String[] allergies4 = {"nillacilan"};
		person4.setAllergies(allergies4);
		String[] medications4 = {"ibupurin:200mg","hydrapermazol:400mg"};
		person4.setMedications(medications4);
	
		listPersons.add(person4);
		
		Persons person5 = new Persons();
		person5.setFirstName("Shawna");
		person5.setLastName("Stelzer");
		person5.setAddress("947 E. Rose Dr");
		person5.setCity("Culver");
		person5.setZip("97451");
		person5.setPhone("841-874-7784");
		person5.setEmail("ssanw@email.com");
		String[] allergies5 = {""};
		person5.setAllergies(allergies5);
		String[] medications5 = {""};
		person5.setMedications(medications5);
	
		listPersons.add(person5);
		
		Persons person6 = new Persons();
		person6.setFirstName("Kendrik");
		person6.setLastName("Stelzer");
		person6.setAddress("947 E. Rose Dr");
		person6.setCity("Culver");
		person6.setZip("97451");
		person6.setPhone("841-874-7784");
		person6.setEmail("bstel@email.com");
		String[] allergies6 = {""};
		person6.setAllergies(allergies6);
		String[] medications6 = {"noxidian:100mg", "pharmacol:2500mg"};
		person6.setMedications(medications6);
		
		listPersons.add(person6);
		
		Persons person7 = new Persons();
		person7.setFirstName("John");
		person7.setLastName("Boyd");
		person7.setAddress("1509 Culver St");
		person7.setCity("Culver");
		person7.setZip("97451");
		person7.setPhone("841-874-6512");
		person7.setEmail("jaboyd@email.com");
		String[] allergies7 = {"nillacilan"};
		person1.setAllergies(allergies7);
		String[] medications7 = {"aznol:350mg", "hydrapermazol:100mg"};
		person1.setMedications(medications7);
		
		listPersons.add(person7);
		
		Persons person8 = new Persons();
		person8.setFirstName("Jacob");
		person8.setLastName("Boyd");
		person8.setAddress("1509 Culver St");
		person8.setCity("Culver");
		person8.setZip("97451");
		person8.setPhone("841-874-6513");
		person8.setEmail("drk@email.com");
		String[] allergies8 = {""};
		person8.setAllergies(allergies8);
		String[] medications8 = {"pharmacol:5000mg", "terazine:10mg", "noznazol:250mg"};
		person8.setMedications(medications8);

		listPersons.add(person8);
		
		when(model.getPersons()).thenReturn(listPersons);
		
		List<String> listAdress = new ArrayList<>();
		listAdress.add("644 Gershwin Cir");
		listAdress.add("908 73rd St");
		listAdress.add("947 E. Rose Dr");
		
		List<Persons> listPersonResult = util.getPersonsFromAddressStation(listAdress);
		assertNotNull(listPersonResult);
		assertEquals(6, listPersonResult.size());
}
	
	@Test
	 public void testGetPersonWithMedicationsAndAllergies () throws Exception {
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
		
		List<MedicalRecord> listMedicalrecords = new ArrayList<>();
		
		MedicalRecord medicalrecord1 = new MedicalRecord();
		medicalrecord1.setFirstName("John");
		medicalrecord1.setLastName("Boyd");
		medicalrecord1.setBirthdate("03/06/1984");
		String[] allergies = {"nillacilan"};
		medicalrecord1.setAllergies(allergies);
		String[] medications = {"aznol:350mg", "hydrapermazol:100mg"};
		medicalrecord1.setMedications(medications);
		
		listMedicalrecords.add(medicalrecord1);
		
		MedicalRecord medicalrecord2 = new MedicalRecord();
		medicalrecord2.setFirstName("Jacob");
		medicalrecord2.setLastName("Boyd");
		medicalrecord2.setBirthdate("03/06/1989");
		String[] allergies2 = {""};
		medicalrecord2.setAllergies(allergies2);
		String[] medications2 = {"pharmacol:5000mg", "terazine:10mg", "noznazol:250mg"};
		medicalrecord2.setMedications(medications2);
		
		listMedicalrecords.add(medicalrecord2);
		
		MedicalRecord medicalrecord3 = new MedicalRecord();
		medicalrecord3.setFirstName("Tenley");
		medicalrecord3.setLastName("Boyd");
		medicalrecord3.setBirthdate("02/18/2012");
		String[] allergies3 = {"peanut"};
		medicalrecord3.setAllergies(allergies3);
		String[] medications3 = {""};
		medicalrecord3.setMedications(medications3);
		
		listMedicalrecords.add(medicalrecord3);
		
		MedicalRecord medicalrecord4 = new MedicalRecord();
		medicalrecord4.setFirstName("Roger");
		medicalrecord4.setLastName("Boyd");
		medicalrecord4.setBirthdate("09/06/2017");
		String[] allergies4 = {""};
		medicalrecord4.setAllergies(allergies4);
		String[] medications4 = {""};
		medicalrecord4.setMedications(medications4);
		
		listMedicalrecords.add(medicalrecord4);
		
		MedicalRecord medicalrecord5 = new MedicalRecord();
		medicalrecord5.setFirstName("Felicia");
		medicalrecord5.setLastName("Boyd");
		medicalrecord5.setBirthdate("01/08/1986");
		String[] allergies5 = {"xilliathal"};
		medicalrecord5.setAllergies(allergies5);
		String[] medications5 = {"tetracyclaz:650mg"};
		medicalrecord5.setMedications(medications5);
		
		listMedicalrecords.add(medicalrecord5);
				
		when(model.getMedicalrecords()).thenReturn(listMedicalrecords);
		
		List <Persons> listPersonResult = util.getPersonWithMedicationsAndAllergies(listPersons);
		assertNotNull(listPersonResult);
		assertEquals(5, listPersonResult.size());
		assertEquals(medicalrecord1.getAllergies(), listPersonResult.get(0).getAllergies());
	    }
	
	 @Test
	 public void testGetAddressStationsFromStationNumber () throws Exception {
		List<FireStations> listFirestation = new ArrayList<>();
		
		FireStations firestation = new FireStations(null, 0);
		firestation.setAddress("1509 Culver St");
		firestation.setStation(3);
		
		listFirestation.add(firestation);
		
		FireStations firestation2 = new FireStations(null, 0);
		firestation2.setAddress("29 15th St");
		firestation2.setStation(2);
		
		listFirestation.add(firestation2);

		FireStations firestation3 = new FireStations(null, 0);
		firestation3.setAddress("834 Binoc Ave");
		firestation3.setStation(3);
		
		listFirestation.add(firestation3);
		
		FireStations firestation4 = new FireStations(null, 0);
		firestation4.setAddress("644 Gershwin Cir");
		firestation4.setStation(1);
		
		listFirestation.add(firestation4);
		
		FireStations firestation5 = new FireStations(null, 0);
		firestation5.setAddress("748 Townings Dr");
		firestation5.setStation(3);
		
		listFirestation.add(firestation5);
		
		FireStations firestation6 = new FireStations(null, 0);
		firestation6.setAddress("112 Steppes Pl");
		firestation6.setStation(3);
		
		listFirestation.add(firestation6);
		
		FireStations firestation7 = new FireStations(null, 0);
		firestation7.setAddress("489 Manchester St");
		firestation7.setStation(4);
		
		listFirestation.add(firestation7);
		
		FireStations firestation8 = new FireStations(null, 0);
		firestation8.setAddress("892 Downing Ct");
		firestation8.setStation(2);
		
		listFirestation.add(firestation8);
		
		FireStations firestation9 = new FireStations(null, 0);
		firestation9.setAddress("908 73rd St");
		firestation9.setStation(1);
		
		listFirestation.add(firestation9);
		
		FireStations firestation10 = new FireStations(null, 0);
		firestation10.setAddress("112 Steppes Pl");
		firestation10.setStation(4);
		
		listFirestation.add(firestation10);
		
		FireStations firestation11 = new FireStations(null, 0);
		firestation11.setAddress("947 E. Rose Dr");
		firestation11.setStation(1);
		
		listFirestation.add(firestation11);
		
		FireStations firestation12 = new FireStations(null, 0);
		firestation12.setAddress("748 Townings Dr");
		firestation12.setStation(3);
		
		listFirestation.add(firestation12);
		
		FireStations firestation13 = new FireStations(null, 0);
		firestation13.setAddress("951 LoneTree Rd");
		firestation13.setStation(2);
		
		listFirestation.add(firestation13);
		
		when(model.getFirestations()).thenReturn(listFirestation);
		
		int stationNumber = 1;
		List<String> listAddress = util.getAddressStationsFromStationNumber(stationNumber);
		assertNotNull(listAddress);
		assertEquals(3, listAddress.size());
  }
}