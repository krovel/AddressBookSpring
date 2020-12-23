package com.cg.addressbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.addressbook.dto.AddressBookDTO;
import com.cg.addressbook.dto.ResponseDTO;
import com.cg.addressbook.model.AddressBookData;

@RestController
@RequestMapping(value = "/addressbookservice")
public class AddressBookController {

	@GetMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getAddressBookContactData() {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, new AddressBookDTO("Kashif Ansari", "99, Chobdari mohalla, Chowk", "Lucknow",
				"Uttar Pradesh", "226003", "+91 9598252500"));
		ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", contactData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookContactData(@PathVariable("id") int id) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, new AddressBookDTO("Laiba Rahil", "99, Chobdari mohalla, Chowk", "Lucknow",
				"Uttar Pradesh", "226003", "+91 9876543210"));
		ResponseDTO responseDTO = new ResponseDTO("Get Call Successfull for id: " + id, contactData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookContactData(@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Created Address Book Contact Data Successfully", contactData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateAddressBookContactData(@PathVariable("id") int id,
			@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated Address Book Contact Data Successfully", contactData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookContactData(@PathVariable("id") int id) {
		ResponseDTO responseDTO = new ResponseDTO("Deleted Address Book Contact Data Successfully", "Deleted id: " + id);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}