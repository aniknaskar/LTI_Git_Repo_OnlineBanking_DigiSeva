package com.lti.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.lti.model.AccountInfo;


@Repository
public class AccountInfoDaoImpl implements AccountInfoDao {

	
	EntityManager entityManager=null;
	
	public AccountInfoDaoImpl() {
		
	}
	
	@Override
	public void createAccountInfo(AccountInfo accountInfo) {
		entityManager.persist(accountInfo);
		
	}

	@Override
	public AccountInfo readAccountInfo(String accountNumber) {
		AccountInfo accountInfo=entityManager.find(AccountInfo.class, accountNumber);
		return accountInfo;
	}

}
