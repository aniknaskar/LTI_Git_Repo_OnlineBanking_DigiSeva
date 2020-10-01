package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.BeneficiaryInfo;

@Repository
public class BeneficiaryInfoDaoImpl implements BeneficiaryInfoDao {
	
	EntityManager entityManager=null;
	
	public BeneficiaryInfoDaoImpl() {
		
	}

	@Override
	public void createBeneficiary(BeneficiaryInfo beneficiary) {
		entityManager.persist(beneficiary);
		
	}

	@Override
	public int deleteBeneficiary(String customerAccountNumber, String beneficiaryAccountNumber) {
		String jpql="Delete b from Beneficiary b where (b.beneficiaryAccountNumber=:beneficiaryAccountNumber and b.accountNumber=:customerAccountNumber) ";
		TypedQuery<BeneficiaryInfo> tQuery=entityManager.createQuery(jpql, BeneficiaryInfo.class);
		tQuery.setParameter("beneficiaryAccountNumber",beneficiaryAccountNumber);
		tQuery.setParameter("customerAccountNumber", customerAccountNumber);
		int result=tQuery.executeUpdate();
		return result;
		
		
	}

	@Override
	public List<BeneficiaryInfo> readAllBeneficiaries(String customerAccountNumber) {
		
		String jpql="Select b from Beneficiary b where  b.accountNumber=:customerAccountNumber";
		TypedQuery<BeneficiaryInfo> tQuery=entityManager.createQuery(jpql, BeneficiaryInfo.class);
		tQuery.setParameter("customerAccountNumber", customerAccountNumber);
		List<BeneficiaryInfo> beneficiaries=tQuery.getResultList();
		return beneficiaries;
	}

}
