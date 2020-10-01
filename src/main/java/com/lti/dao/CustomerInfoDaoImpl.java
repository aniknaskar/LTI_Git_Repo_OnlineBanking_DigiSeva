package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.lti.model.CustomerInfo;

@Repository
public class CustomerInfoDaoImpl implements CustomerInfoDao {
	
	EntityManager entityManager=null;
	
	public CustomerInfoDaoImpl() {
		
	}

	@Override
	public CustomerInfo readCustomerInfo(String customerId) {
		CustomerInfo customerDetails=entityManager.find(CustomerInfo.class, customerId);
		return customerDetails;
	}

	@Override
	public void createCustomerInfo(CustomerInfo customerDetails) {
		entityManager.persist(customerDetails);
		
	}

	@Override
	public void updateMobileNumber(String customerId, String mobileNumber) {
		CustomerInfo customerDetails=entityManager.find(CustomerInfo.class, customerId);
		customerDetails.setMobileNumber(mobileNumber);
		entityManager.merge(customerDetails);
	}

}
