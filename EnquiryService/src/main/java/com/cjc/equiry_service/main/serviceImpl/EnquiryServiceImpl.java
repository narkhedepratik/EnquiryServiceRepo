package com.cjc.equiry_service.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.equiry_service.main.model.EnquiryDetails;
import com.cjc.equiry_service.main.repository.EnquiryRepository;
import com.cjc.equiry_service.main.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService{

	@Autowired private EnquiryRepository enquiryRepository;
	@Override
	public EnquiryDetails saveEnquiry(EnquiryDetails enquiryDetails) {
		
		return enquiryRepository.save(enquiryDetails);
	}

}
