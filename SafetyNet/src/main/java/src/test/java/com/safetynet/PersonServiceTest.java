/*
package src.test.java.com.safetynet;



import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.safetynet.model.MasterModel;
import com.safetynet.model.Persons;
import com.safetynet.service.PersonService;

public class PersonServiceTest {
	private static PersonService personService;

	private static MasterModel model;
	
	@BeforeAll
	private static void setUp() {
		model = mock(Model.class);
		personService = new PersonService(model);
	}
	
	@Test
	public void testAdd() throws Exception {
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

		listPersons.add(person2);

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
		
		assertEquals(6, listPersons.size());
		
		Persons newPerson = new Persons();
		newPerson.setFirstName("AAAAA");
		newPerson.setLastName("BBBBB");
		newPerson.setAddress("CCCCCC");
		newPerson.setCity("DDDDD");
		newPerson.setZip("EEEEE");
		newPerson.setPhone("FFFFF");
		newPerson.setEmail("GGGGG");
		
		when(model.getPersons()).thenReturn(listPersons);
		listPersons = personService.add(newPerson);

		assertEquals(7, listPersons.size());
		assertEquals(newPerson.getFirstName(), listPersons.get(6).getFirstName());	
	}
	
	@Test
	public void testUpdate() throws Exception {
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

		listPersons.add(person2);

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
		
		assertEquals("aly@imail.com", listPersons.get(5).getEmail());
		
		Persons updatedPerson = new Persons();
		updatedPerson.setFirstName("Allison");
		updatedPerson.setLastName("Boyd");
		updatedPerson.setEmail("aaaabbb@gmail.com");
		
		when(model.getPersons()).thenReturn(listPersons);
		listPersons = personService.update(updatedPerson);
		
		assertEquals("aaaabbb@gmail.com", listPersons.get(5).getEmail());
	}
	
	@Test
	public void testDelete() throws Exception {
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

		listPersons.add(person2);

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
		
		assertEquals(6, listPersons.size());
		
		when(model.getPersons()).thenReturn(listPersons);
		listPersons = personService.delete(person6.getFirstName(), person6.getLastName());

		assertEquals(5, listPersons.size());
	}

}
*/