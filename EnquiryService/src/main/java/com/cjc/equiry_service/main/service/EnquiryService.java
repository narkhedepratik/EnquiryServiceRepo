package com.cjc.equiry_service.main.service;

import com.cjc.equiry_service.main.model.EnquiryDetails;

public interface EnquiryService {


   public	EnquiryDetails updateEnquiry(int enquiryId, EnquiryDetails enquiry);

 public	EnquiryDetails saveEnquiry(EnquiryDetails enquiryDetails);

}
