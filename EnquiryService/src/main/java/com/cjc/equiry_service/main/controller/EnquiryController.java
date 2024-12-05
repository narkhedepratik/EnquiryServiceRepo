package com.cjc.equiry_service.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.equiry_service.main.model.EnquiryDetails;
import com.cjc.equiry_service.main.service.EnquiryService;

@RequestMapping("/enquiry")
@RestController
public class EnquiryController {
	
	@Autowired private EnquiryService enquiryService;
	
	@PostMapping("/save-enquiry")
	public ResponseEntity<EnquiryDetails> onSaveEnquiry(@RequestBody EnquiryDetails enquiryDetails)
	{
		EnquiryDetails enquiryDetailsRef=enquiryService.saveEnquiry(enquiryDetails);

	   return new ResponseEntity<EnquiryDetails>(enquiryDetailsRef, HttpStatus.CREATED);
	}

}
