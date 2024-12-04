package com.cjc.equiry_service.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.equiry_service.main.model.EnquiryDetails;

public interface EnquiryRepository extends JpaRepository<EnquiryDetails, Integer>{
	

}
