package com.java;

import java.util.ArrayList;

public class AdddressBook {

	private ArrayList<ContactPerson> contactBook;

	public void AddressBook(ArrayList<ContactPerson> contactBook) {
		this.contactBook = contactBook;
	}

	public ArrayList<ContactPerson> getContactBook() {
		return contactBook;
	}

	public void setContactBook(ArrayList<ContactPerson> contactBook) {
		this.contactBook = contactBook;
	}

}
