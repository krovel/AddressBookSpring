package com.cg.addressbook.dto;

import lombok.Data;

public @Data class AddressBookDTO {

	public String fullName;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phoneNumber;
	
	public AddressBookDTO(String fullName, String address, String city, String state, String zip, String phoneNumber) {
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
}