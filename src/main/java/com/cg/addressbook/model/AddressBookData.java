package com.cg.addressbook.model;

import com.cg.addressbook.dto.AddressBookDTO;

public class AddressBookData {

	private Integer id;
	private String fullName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	
	public AddressBookData() {
	}
	
	public AddressBookData(Integer id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.fullName = addressBookDTO.fullName;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zip = addressBookDTO.zip;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "AddressBookData [id=" + id + ", fullName=" + fullName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}	
}