package com.cg.addressbook.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.addressbook.dto.AddressBookDTO;
import com.cg.addressbook.exceptions.AddressBookException;
import com.cg.addressbook.model.AddressBookData;
import com.cg.addressbook.repository.AddressBookRepository;

@Service
public class AddressBookService implements IAddressBookService {

	@Autowired
	private AddressBookRepository addressBookRepository;

	@Override
	public List<AddressBookData> getAddressBookContactData() {
		return (List<AddressBookData>) addressBookRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookContactDataById(int id) {
		try {
			AddressBookData contactData = addressBookRepository.findById(id).get();
			return contactData;
		} catch (NoSuchElementException exception) {
			throw new AddressBookException("Address Book Contact Not Found");
		}
	}

	@Override
	public AddressBookData createAddressBookContactData(AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(addressBookDTO);
		return addressBookRepository.save(contactData);
	}

	@Override
	public AddressBookData updateAddressBookContactData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData contactData = this.getAddressBookContactDataById(id);
		if (contactData != null) {
			deleteAddressBookContactData(id);
			contactData.setFullName(addressBookDTO.fullName);
			contactData.setAddress(addressBookDTO.address);
			contactData.setCity(addressBookDTO.city);
			contactData.setState(addressBookDTO.state);
			contactData.setZip(addressBookDTO.zip);
			contactData.setPhoneNumber(addressBookDTO.phoneNumber);
			contactData = addressBookRepository.save(contactData);
		}
		return contactData;
	}

	@Override
	public void deleteAddressBookContactData(int id) {
		addressBookRepository.deleteById(id);
	}
}