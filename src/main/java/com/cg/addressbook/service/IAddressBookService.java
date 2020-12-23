package com.cg.addressbook.service;

import java.util.List;

import com.cg.addressbook.dto.AddressBookDTO;
import com.cg.addressbook.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookContactData();

	AddressBookData getAddressBookContactDataById(int id);

	AddressBookData createAddressBookContactData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookContactData(int id, AddressBookDTO addressBookDTO);

	void deleteAddressBookContactData(int id);
}