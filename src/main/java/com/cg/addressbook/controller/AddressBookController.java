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

@RestController
@RequestMapping(value = "/addressbookservice")
public class AddressBookController {

	@GetMapping(value = { "", "/", "/get" })
	public ResponseEntity<String> getAddressBookContactData() {
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<String> getAddressBookContactData(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Get Call Success for id: " + id, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookContactData(@RequestBody String name) {
		return new ResponseEntity<String>("Created Address Book Contact Data for: " + name, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateAddressBookContactData(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Updated Address Book Contact Data for id: " + id, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAddressBookContactData(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Delete Call Success for id: " + id, HttpStatus.OK);
	}
}