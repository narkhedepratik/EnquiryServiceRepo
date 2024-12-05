package com.cjc.equiry_service.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.equiry_service.main.constant.ExceptionMessageConstant;
import com.cjc.equiry_service.main.exceptions.EnquiryNotFoundException;
import com.cjc.equiry_service.main.model.EnquiryDetails;
import com.cjc.equiry_service.main.repository.EnquiryRepository;
import com.cjc.equiry_service.main.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService{

	@Autowired private EnquiryRepository er;
	@Override                                   
	public EnquiryDetails updateEnquiry(int enquiryId, EnquiryDetails enquiry) {
           	
	Optional<EnquiryDetails> opEnquiry	=er.findById(enquiryId);
	  if(opEnquiry.isPresent())
	  {
		  return er.save(enquiry);
	  }
	  else {
		  throw new EnquiryNotFoundException(ExceptionMessageConstant.ENQUIRY_NOT_FOUND+enquiryId);
	  }
	
	
	}

}
