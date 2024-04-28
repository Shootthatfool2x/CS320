// David Ryan Summers
// Prof Kalysa Wilson
// SNHU CS320
// 3/24/2024

package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {
	
	// the 5 tests below make sure the numeric criteria is met. 
	// the 4 test after check for null values.
	// I did not test contactID since I cannot modify it once created,
	// nor can i have a null contactID

	
	@Test
	@DisplayName("Contact ID must be less than 10 characters.")
	void testcontactID() {
		Contact contact = new Contact("firstName","lastName","Number","address");
		if(contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("First Name must be less than 10 characters.")
	void testfirstName() {
		Contact contact = newContact("Extreamlylongname","lastName","Number","address");
		if(contact.getFirstName().length() > 10) {
			fail("First Name has more than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Last Name must be less than 10 characters.")
	void testlastName() {
		Contact contact = newContact("firstName","Extreamlylongname","Number","address");
		if(contact.getLastName().length() > 10) {
			fail("Last Name must be less than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Phone number must have exactly 10 digits.")
	void testPhone() {
		Contact contact = new Contact("firstName", "lastName", "address","5555555555");
		if(contact.getPhoneNumber().length() != 10) {
			fail("Phone number must have exactly 10 digits.");
		}
	}
	@Test
	@DisplayName("address field has to be less than 30 characters")
	void testAddress() {
		Contact contact = newContact("firstName","lastName","Number",
				"1234567890 Extreamlylonnngaddress");
		if(contact.getAddress().length() > 30) {
			fail("The address contains greater than 30 characters.");
		}
	}
	
	@Test
	@DisplayName("First Name must not be null")
	void testfirstNameNull() {
		Contact contact = new Contact(null, "lastName","Number","address");
		assertNotNull(contact.getFirstName(), "First name is not null.");
	}
	
	@Test
	@DisplayName("Last Name must not be null")
	void testlastNameNull() {
		Contact contact = new Contact("FirstName", null,"Number","Address");
		assertNotNull(contact.getLastName(), "Last name is not null.");
	}
	
	@Test
	@DisplayName("Phone Number must not be null")
	void testphoneNumberNull() {
		Contact contact = new Contact("FirstName", "LastName", null,"Address");
		assertNotNull(contact.getPhoneNumber(), "Phone number is not null.");
	}
	
	@Test
	@DisplayName("Address must not be null")
	void testaddressNull() {
		Contact contact = new Contact("FirstName", "LastName","Number",null);
		assertNull(contact.getAddress(), "Address was null.");
	}
}