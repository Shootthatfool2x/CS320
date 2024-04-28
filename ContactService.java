// David Ryan Summers
// Prof Kalysa Wilson
// SNHU CS320
// 3/24/2024
package main;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	 private final ArrayList<Contact> contactList = new ArrayList<>();
	 //method to add
	 public boolean addContact(Contact contact) {
		 if (contactList.isEmpty() || !hasContactWithId(contact.getId())) {
			 contactList.add(contact);
			 	return true;
		 	}
		 return false;
	 }
	 
	 private boolean hasContactWithId(String id) {
		 for (Contact existingContact : contactList) {
			 if (existingContact.getId().equalsIgnoreCase(id)) {
				 return true;
			 }
		 }
		 return false;
	 }
	 // method to remove
	 public boolean removeContactById(String id) {
		 Contact contactToRemove = findContactById(id);
		 return contactToRemove != null && contactList.remove(contactToRemove);
	 }
	 private Contact findContactById(String id) {
		 for (Contact contact : contactList) {
			 	if (contact.getId().equalsIgnoreCase(id)) {
			 		return contact;
			 	}
		 }
		 return null;
	 }
	 // method to update
	 public boolean updateContactFirstName(String contactId, String firstName) {
		 Contact contactToUpdate = findContactById(contactId);
		 if (contactToUpdate != null) {
			 contactToUpdate.setFirstName(firstName);
			 return true;
			 }
		 return false;
	 	}
}
