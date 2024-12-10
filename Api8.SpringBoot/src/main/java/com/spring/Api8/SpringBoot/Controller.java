package com.spring.Api8.SpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	Country ct = new Country(123, "India");

	@DeleteMapping("/deletecountry/{ctr}")
	public ResponseEntity<String> deleteCountry(@PathVariable String ctr) {

		System.out.println("Country needs to be deleted:" + ctr);
		if (ctr.equalsIgnoreCase(ct.getCname())) {
			
			System.out.println("Deleting Country:" + ct.getCname());
//			ct.setCname("Dubai");
		} else {
			return new ResponseEntity<>("Country not found", HttpStatus.NOT_FOUND);

		}

		return new ResponseEntity<>("Country deleted Successfully", HttpStatus.OK);
	}

}
