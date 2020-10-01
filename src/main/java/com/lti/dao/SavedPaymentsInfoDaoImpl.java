package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.SavedPaymentsInfo;

@Repository
public class SavedPaymentsInfoDaoImpl implements SavedPaymentsInfoDao {

	EntityManager entityManager=null;
	
	public SavedPaymentsInfoDaoImpl() {
		
	}
	@Override
	public void createSavedPayment(SavedPaymentsInfo savedPayment) {
		entityManager.persist(savedPayment);
		
	}

	@Override
	public List<SavedPaymentsInfo> readAllSavedPaymentsByAccountNumber(String accountNumber) {
		String jpql="Select s from SavedPayments s where s.fromAccountNumber=:accountNumber";
		TypedQuery<SavedPaymentsInfo> tQuery=entityManager.createQuery(jpql, SavedPaymentsInfo.class);
		List<SavedPaymentsInfo> savedPayments=tQuery.getResultList();
		return savedPayments;
	}

	@Override
	public int deleteSavedPayment(String serialNumber) {
		String jpql="Delete s from SavedPayments s where s.serialNumber=:serialNumber";
		TypedQuery<SavedPaymentsInfo> tQuery=entityManager.createQuery(jpql, SavedPaymentsInfo.class);
		int result=tQuery.executeUpdate();
		return result;
		
	}

}
