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
import org.junit.runners.Parameterized.BeforeParam;
import org.mockito.Mockito;

import com.safetynet.model.FireStations;
import com.safetynet.model.MasterModel;
import com.safetynet.model.MedicalRecord;
import com.safetynet.model.PersonInfo;
import com.safetynet.model.Persons;
import com.safetynet.service.FireStationService;
import com.safetynet.service.PersonInfoService;
import com.safetynet.service.PersonService;


public class FirestationServiceTest {
private static FireStationService firestationService;
	
    private static MasterModel model;
	
    private static Util util;
    
    @BeforeParam
    private static void setUp() {
    	 model = mock(MasterModel.class);
    	 util = mock(Util.class);
    	 firestationService = new FireStationService();
    }

    @Test
	 public void testGetPersons () throws Exception {
   	List<Persons> listPersons = new ArrayList<>();
		Persons person1 = new Persons();
		person1.setFirstName("Peter");
		person1.setLastName("Duncan");
		person1.setAddress("644 Gershwin Cir");
		person1.setCity("Culver");
		person1.setZip("97451");
		person1.setPhone("841-874-6512");
		person1.setEmail("jaboyd@email.com");
		
		listPersons.add(person1);
		
		Persons person2 = new Persons();
		person2.setFirstName("Reginold");
		person2.setLastName("Walker");
		person2.setAddress("908 73rd St");
		person2.setCity("Culver");
		person2.setZip("97451");
		person2.setPhone("841-874-8547");
		person2.setEmail("reg@email.com");

		listPersons.add(person2);

		Persons person3 = new Persons();
		person3.setFirstName("Jamie");
		person3.setLastName("Peters");
		person3.setAddress("908 73rd St");
		person3.setCity("Culver");
		person3.setZip("97451");
		person3.setPhone("841-874-7462");
		person3.setEmail("jpeter@email.com");
	
		listPersons.add(person3);
		
		Persons person4 = new Persons();
		person4.setFirstName("Brian");
		person4.setLastName("Stelzer");
		person4.setAddress("947 E. Rose Dr");
		person4.setCity("Culver");
		person4.setZip("97451");
		person4.setPhone("841-874-7784");
		person4.setEmail("bstel@email.com");
			
		listPersons.add(person4);
		
		Persons person5 = new Persons();
		person5.setFirstName("Shawna");
		person5.setLastName("Stelzer");
		person5.setAddress("947 E. Rose Dr");
		person5.setCity("Culver");
		person5.setZip("97451");
		person5.setPhone("841-874-7784");
		person5.setEmail("ssanw@email.com");
	
		listPersons.add(person5);
		
		Persons person6 = new Persons();
		person6.setFirstName("Kendrik");
		person6.setLastName("Stelzer");
		person6.setAddress("947 E. Rose Dr");
		person6.setCity("Culver");
		person6.setZip("97451");
		person6.setPhone("841-874-7784");
		person6.setEmail("bstel@email.com");
		
		listPersons.add(person6);
		
		List<MedicalRecord> listMedicalrecords = new ArrayList<>();
		
		MedicalRecord medicalrecord1 = new MedicalRecord(); 
		medicalrecord1.setFirstName("Peter");
		medicalrecord1.setLastName("Duncan");
		medicalrecord1.setBirthdate("09/06/2000");
		String[] allergies = {"shellfish"};
		medicalrecord1.setAllergies(allergies);
		String[] medications = {""};
		medicalrecord1.setMedications(medications);
		
		listMedicalrecords.add(medicalrecord1);
		
		MedicalRecord medicalrecord2 = new MedicalRecord();
		medicalrecord2.setFirstName("Reginold");
		medicalrecord2.setLastName("Walker");
		medicalrecord2.setBirthdate("08/30/1979");
		String[] allergies2 = {"illisoxian"};
		medicalrecord2.setAllergies(allergies2);
		String[] medications2 = {"thradox:700mg"};
		medicalrecord2.setMedications(medications2);
		
		listMedicalrecords.add(medicalrecord2);
		
		MedicalRecord medicalrecord3 = new MedicalRecord();
		medicalrecord3.setFirstName("Jamie");
		medicalrecord3.setLastName("Peters");
		medicalrecord3.setBirthdate("03/06/1982");
		String[] allergies3 = {""};
		medicalrecord3.setAllergies(allergies3);
		String[] medications3 = {""};
		medicalrecord3.setMedications(medications3);
		
		listMedicalrecords.add(medicalrecord3);
		
		MedicalRecord medicalrecord4 =new MedicalRecord();
		medicalrecord4.setFirstName("Brian");
		medicalrecord4.setLastName("Stelzer");
		medicalrecord4.setBirthdate("12/06/1975");
		String[] allergies4 = {"nillacilan"};
		medicalrecord4.setAllergies(allergies4);
		String[] medications4 = {"ibupurin:200mg","hydrapermazol:400mg"};
		medicalrecord4.setMedications(medications4);
		
		listMedicalrecords.add(medicalrecord4);
		
		MedicalRecord medicalrecord5 = new MedicalRecord();
		medicalrecord5.setFirstName("Shawna");
		medicalrecord5.setLastName("Stelzer");
		medicalrecord5.setBirthdate("07/08/1980");
		String[] allergies5 = {""};
		medicalrecord5.setAllergies(allergies5);
		String[] medications5 = {""};
		medicalrecord5.setMedications(medications5);
		
		listMedicalrecords.add(medicalrecord5);
		
		MedicalRecord medicalrecord6 = new MedicalRecord();
		medicalrecord6.setFirstName("Kendrik");
		medicalrecord6.setLastName("Stelzer");
		medicalrecord6.setBirthdate("03/06/2014");
		String[] allergies6 = {""};
		medicalrecord6.setAllergies(allergies6);
		String[] medications6 = {"noxidian:100mg", "pharmacol:2500mg"};
		medicalrecord6.setMedications(medications6);
		
		listMedicalrecords.add(medicalrecord6);
		
		when(model.getMedicalrecords()).thenReturn(listMedicalrecords);
		when(util.calculAge(Mockito.anyString())).thenCallRealMethod();
		
		PersonInfo personInfo = firestationService.getPersons(listPersons);
		assertNotNull(personInfo);
		assertEquals(5, personInfo.getNbAdults());
		assertEquals(1, personInfo.getNbChilds());
  }
   
    
    @Test
	 public void testAdd () throws Exception {
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
		
		assertEquals(13, listFirestation.size());

		FireStations newFirestation = new FireStations(null, 0);
		newFirestation.setAddress("ZZZZ");
		newFirestation.setStation(3);
		
		when(model.getFirestations()).thenReturn(listFirestation);
		listFirestation = firestationService.add(newFirestation);
		assertEquals(14, listFirestation.size());
		assertEquals(newFirestation.getAddress(), listFirestation.get(13).getAddress());
    }
    

    @Test
	 public void testUpdate () throws Exception {
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
		
		assertEquals(13, listFirestation.size());
		assertEquals("2", listFirestation.get(12).getStation());
		
		FireStations updatedFirestation = new FireStations(null, 0);
		updatedFirestation.setAddress("951 LoneTree Rd");
		updatedFirestation.setStation(1);
    	
		when(model.getFirestations()).thenReturn(listFirestation);
		listFirestation = firestationService.update(updatedFirestation);
		
		assertEquals(13, listFirestation.size());
		assertEquals("1", listFirestation.get(12).getStation());
    }
    
    @Test
	 public void testDelete () throws Exception {
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
		
		assertEquals(13, listFirestation.size());
		assertEquals("951 LoneTree Rd", listFirestation.get(12).getAddress());
		assertEquals("2", listFirestation.get(12).getStation());
		
		when(model.getFirestations()).thenReturn(listFirestation);
		listFirestation = firestationService.delete(firestation);
		
		assertEquals(12, listFirestation.size());	
    }

}
