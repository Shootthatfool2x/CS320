// David Ryan Summers
// Prof Kalysa Wilson
// SNHU CS320
// 3/24/2024


// variables
package main;
// attributes
public class Contact {
	 private String id;
	 private String firstName;
	 private String lastName;
	 private String number;
	 private String address;
	 
	 // initialize contact
	 // apply criteria
	 public Contact(String id, String firstName, String lastName, String number, 
			 String address) {
		 if (id == null || id.length() > 10) {
			 throw new IllegalArgumentException("The contact's ID cannot be longer "
			 		+ "than 10 characters and must not be null");
		 }
		 if (firstName == null || firstName.length() > 10) {
			 throw new IllegalArgumentException("The contact's ID cannot be longer than 10 "
			 		+ "characters and must not be null");
		 }	 
		 if (firstName == null || firstName.length() > 10) {
			 throw new IllegalArgumentException("The contact's first name cannot be longer than "
			 		+ "10 characters and must not be null.");
		 }
		 if (lastName == null || lastName.length() > 10) {
			 throw new IllegalArgumentException("The contact's last name cannot be longer than "
			 		+ "10 characters and must not be null.");
		 }
		 if (number == null || number.length() > 10) {
			 throw new IllegalArgumentException("The contact's phone number must be exactly 10 "
			 		+ "digits.");
		 }
		 if (address == null || address.length() > 30) {
			 throw new IllegalArgumentException("The contact's adress must be no longer than 30 "
			 		+ "characters and must not be null.");
		 }
		 this.id = id;
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.number = number;
		 this.address = address;
	 }

	 public String getId() {
		 return this.id;
	 }
	 public String getFirstName() {
		 return this.firstName;
	 }
	 public String getLastName() {
		 return this.lastName;
	 }
	 public String getNumber() {
		 return this.number;
	 }
	 public String getAddress() {
		 return this.address;
	 }
	 
	 @Override
	 public String toString() {
		 return "Contact [" + "id = " + id + ", firstName = " + firstName + ", "
		 		+ "lastName = " + lastName + ", Number = " + number + ", address = " + address + ']';
	 }
}
