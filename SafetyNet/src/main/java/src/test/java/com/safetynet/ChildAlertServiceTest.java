/**
 
 
package src.test.java.com.safetynet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safetynet.model.ChildAlert;
import com.safetynet.model.MasterModel;
import com.safetynet.model.MedicalRecord;
import com.safetynet.model.Persons;
import com.safetynet.service.ChildAlertService;

import Utils.Util;
/**
 * @author Quentin
 *
 
public class ChildAlertServiceTest {
private static ChildAlertService childAlertService;

	
    private static MasterModel model;
		
    private static Util util;
    
 //   @BeforeAll
    
    private static void setUp() {
    	 model = mock(Model.class);
    	 util = mock(Util.class);
    	childAlertService = new ChildAlertService(model, util);
    }
	
   
	@Test
	 public void testGetChildsFromListOfPersons () throws Exception {
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
		
		MedicalRecord medicalrecord1 = new MedicalRecord (null, null, null, null);
		medicalrecord1.setFirstName("John");
		medicalrecord1.setLastName("Boyd");
		medicalrecord1.setBirthdate("03/06/1984");
		
		listMedicalrecords.add(medicalrecord1);
		
		MedicalRecord medicalrecord2 = new MedicalRecord(null, null, null, null);
		medicalrecord2.setFirstName("Jacob");
		medicalrecord2.setLastName("Boyd");
		medicalrecord2.setBirthdate("03/06/1989");
		
		listMedicalrecords.add(medicalrecord2);
		
		MedicalRecord medicalrecord3 = new MedicalRecord(null, null, null, null);
		medicalrecord3.setFirstName("Tenley");
		medicalrecord3.setLastName("Boyd");
		medicalrecord3.setBirthdate("02/18/2012");
		
		listMedicalrecords.add(medicalrecord3);
		
		MedicalRecord medicalrecord4 = new MedicalRecord(null, null, null, null);
		medicalrecord4.setFirstName("Roger");
		medicalrecord4.setLastName("Boyd");
		medicalrecord4.setBirthdate("09/06/2017");
		
		listMedicalrecords.add(medicalrecord4);
		
		MedicalRecord medicalrecord5 = new MedicalRecord(null, null, null, null);
		medicalrecord5.setFirstName("Felicia");
		medicalrecord5.setLastName("Boyd");
		medicalrecord5.setBirthdate("01/08/1986");
		
		listMedicalrecords.add(medicalrecord5);
				
		when(model.getMedicalrecords()).thenReturn(listMedicalrecords);
		when(util.calculAge(Mockito.anyString())).thenCallRealMethod();
		
		List <Persons> listChilds= childAlertService.getChildsFromListOfPersons(listPersons);
		assertNotNull(listChilds);
		assertEquals(2, listChilds.size());
	    }
	
	@Test
	 public void testGetChildsFromListOfPersonsWithNullValue () throws Exception {
		
		List<MedicalRecord> listMedicalrecords = new ArrayList<>();
		
		MedicalRecord medicalrecord1 = new MedicalRecord(null, null, null, null);
		medicalrecord1.setFirstName("John");
		medicalrecord1.setLastName("Boyd");
		medicalrecord1.setBirthdate("03/06/1984");
		
		listMedicalrecords.add(medicalrecord1);
		
		MedicalRecord medicalrecord2 = new MedicalRecord(null, null, null, null);
		medicalrecord2.setFirstName("Jacob");
		medicalrecord2.setLastName("Boyd");
		medicalrecord2.setBirthdate("03/06/1989");
		
		listMedicalrecords.add(medicalrecord2);
		
		MedicalRecord medicalrecord3 = new MedicalRecord(null, null, null, null);
		medicalrecord3.setFirstName("Tenley");
		medicalrecord3.setLastName("Boyd");
		medicalrecord3.setBirthdate("02/18/2012");
		
		listMedicalrecords.add(medicalrecord3);
		
		MedicalRecord medicalrecord4 = new MedicalRecord(null, null, null, null);
		medicalrecord4.setFirstName("Roger");
		medicalrecord4.setLastName("Boyd");
		medicalrecord4.setBirthdate("09/06/2017");
		
		listMedicalrecords.add(medicalrecord4);
		
		MedicalRecord medicalrecord5 = new MedicalRecord(null, null, null, null);
		medicalrecord5.setFirstName("Felicia");
		medicalrecord5.setLastName("Boyd");
		medicalrecord5.setBirthdate("01/08/1986");
		
		listMedicalrecords.add(medicalrecord5);
				
		when(model.getMedicalrecords()).thenReturn(listMedicalrecords);
		
		List<Persons> listPersons = null;
		assertThrows(
				  Exception.class,
		            ()->childAlertService.getChildsFromListOfPersons(listPersons));
	    }
	
	@Test
	 public void testGetChildsAndMembersFamily () throws Exception {
		List<Persons> listChilds = new ArrayList<>();

		Persons person1 = new Persons();
		person1.setFirstName("Tenley");
		person1.setLastName("Boyd");
	
		listChilds.add(person1);
		
		Persons person2 = new Persons();
		person2.setFirstName("Roger");
		person2.setLastName("Boyd");
	
		listChilds.add(person2);
		
		Persons person3 = new Persons();
		person3.setFirstName("Zach");
		person3.setLastName("Zemicks");
	
		listChilds.add(person3);
		
		List<Persons> listPersons = new ArrayList<>();
		
		Persons person4 = new Persons();
		person4.setFirstName("John");
		person4.setLastName("Boyd");
		
		listPersons.add(person4);
		
		Persons person5 = new Persons();
		person5.setFirstName("Jacob");
		person5.setLastName("Boyd");
		
		listPersons.add(person5);
		
		Persons person6 = new Persons();
		person6.setFirstName("Felicia");
		person6.setLastName("Boyd");
		
		listPersons.add(person6);
		
		Persons person7 = new Persons();
		person7.setFirstName("Sophia");
		person7.setLastName("Zemicks");
		
		listPersons.add(person7);
		
		Persons person8 = new Persons();
		person8.setFirstName("Warren");
		person8.setLastName("Zemicks");
		
		listPersons.add(person8);
		
		Persons person9 = new Persons();
		person9.setFirstName("Eric");
		person9.setLastName("Cadigan");
		
		listPersons.add(person9);
		
		Persons person10 = new Persons();
		person10.setFirstName("Tenley");
		person10.setLastName("Boyd");
	
		listPersons.add(person10);
		
		Persons person11 = new Persons();
		person11.setFirstName("Roger");
		person11.setLastName("Boyd");
	
		listPersons.add(person11);
		
		Persons person12 = new Persons();
		person12.setFirstName("Zach");
		person12.setLastName("Zemicks");
	
		listPersons.add(person12);
		
		ChildAlert childAlert= childAlertService.getChildsAndMembersFamily(listChilds, listPersons);
		assertNotNull(childAlert);
		assertEquals(3, childAlert.getChilds().size());
		assertEquals(5, childAlert.getMembersOfFamily().size());
	}
	
	@Test
	 public void testGetChildsAndMembersFamilyWithListOfChildsIsEmpty () throws Exception {
		List<Persons> listChilds = new ArrayList<>();
		
		List<Persons> listPersons = new ArrayList<>();
		
		Persons person = new Persons();
		person.setFirstName("John");
		person.setLastName("Boyd");
		
		listPersons.add(person);
		
		Persons person2 = new Persons();
		person2.setFirstName("Jacob");
		person2.setLastName("Boyd");
		
		listPersons.add(person2);
		
		Persons person3 = new Persons();
		person3.setFirstName("Felicia");
		person3.setLastName("Boyd");
		
		listPersons.add(person3);
		
		Persons person4 = new Persons();
		person4.setFirstName("Sophia");
		person4.setLastName("Zemicks");
		
		listPersons.add(person4);
		
		Persons person5 = new Persons();
		person5.setFirstName("Warren");
		person5.setLastName("Zemicks");
		
		listPersons.add(person5);
		
		Persons person6 = new Persons();
		person6.setFirstName("Eric");
		person6.setLastName("Cadigan");
		
		listPersons.add(person6);
		
		ChildAlert childAlert= childAlertService.getChildsAndMembersFamily(listChilds, listPersons);
		assertTrue(childAlert.getChilds().isEmpty());
		assertTrue(childAlert.getMembersOfFamily().isEmpty());
	}
	

}
*/
