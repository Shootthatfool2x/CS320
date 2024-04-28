// David Ryan Summers
// Prof Kalysa Wilson
// SNHU CS320
// 3/24/2024

package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	 void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1", "Ryan", "Summers", "0123456789", "12 Tree St");
		Contact contact2 = new Contact("2", "Katie", "Summers", "0123456788", "13 Tree St");
		assertTrue(contactService.addContact(contact1));
		assertTrue(contactService.addContact(contact2));
		// adding duplicate should fail 
		assertFalse(contactService.addContact(contact1)); 
	 }

	@Test
	 void testRemoveContactById() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1", "Ryan", "Summers", "0123456789", "12 Tree St");
		contactService.addContact(contact);
		assertTrue(contactService.removeContactById("1"));
		// remove same contact should fail due to it already being removed
		assertFalse(contactService.removeContactById("1"));
	 }
	
	@Test
	 void testUpdateContactFirstName() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1", "Ryan", "Summers", "0123456789", "12 Tree St");
		contactService.addContact(contact);
		assertTrue(contactService.updateContactFirstName("1", "Katie"));
		// should fail since ID 2 does not exist
		assertFalse(contactService.updateContactFirstName("2", "Katie")); 
	 }
	
	@Test
	 void testUpdateContactLastName() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1", "Ryan", "Summers", "0123456789", "12 Tree St");
		contactService.addContact(contact);
		assertTrue(contactService.updateContactLastName("1", "Poole"));
		// should fail since ID 2 does not exist
		assertFalse(contactService.updateContactLastName("2", "Poole"));
	}
	
	@Test
	 void testUpdateContactPhone() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1", "Ryan", "Summers", "0123456789", "12 Tree St");
		contactService.addContact(contact);
		assertTrue(contactService.updateContactLastName("1", "Summers", "0123456788"));
		// should fail since ID 2 does not exist
		assertFalse(contactService.updateContactLastName("2", "Summers", "0123456789"));
	}

	@Test
	 void testUpdateContactAddress() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1", "Ryan", "Summers", "0123456789", "12 Tree St");
		contactService.addContact(contact);
		assertTrue(contactService.updateContactLastName("1", "Ryan", "Summers", "0123456789", "123 Tree St"));
		// should fail since ID 2 does not exist
		assertFalse(contactService.updateContactLastName("2", "Ryan", "Summers", "0123456789", "1234 Tree St"));
	}
}
