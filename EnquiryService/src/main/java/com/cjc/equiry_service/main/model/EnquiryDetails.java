package com.cjc.equiry_service.main.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import com.cjc.equiry_service.main.enums.EnquiryStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EnquiryDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enquiryId;
	private String customerFullName;
	private String emailId;
	private long contactNumber;
	private String pancardNumber;
	private int age;
	@CreationTimestamp
	private Date registerdOn;
	@Enumerated(EnumType.STRING)
	private EnquiryStatus enquiryStatus;  //"REGISTER","PRIMARY_VERIFIED","REJECTED","APROVED"
	@OneToOne(cascade = CascadeType.MERGE.REFRESH.REMOVE.DETACH)
	private CibilDetails cibilDetails;

}
