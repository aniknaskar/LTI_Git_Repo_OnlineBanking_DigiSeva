package com.lti.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.lti.model.AccountInfo;
import com.lti.model.CustomerInfo;
import com.lti.model.LoginInfo;


@Repository
public class LoginInfoDaoImpl implements LoginInfoDao  {

	EntityManager entityManager=null;
	
	public LoginInfoDaoImpl() {
		
	}
	
	@Override
	public LoginInfo readLoginInfo(String internetBankingId) {
		LoginInfo loginInfo=entityManager.find(LoginInfo.class, internetBankingId);
		return loginInfo;
	}

	@Override
	public void updateLoginPassword(String newLoginPassword,String internetBankingId) {
		LoginInfo loginInfo=entityManager.find(LoginInfo.class, internetBankingId);
		loginInfo.setLoginPassword(newLoginPassword);
		entityManager.merge(loginInfo);
		
	}

	@Override
	public void createInternetBanking(String accountNumber,String loginPassword) {
		
		LoginInfo loginInfo=new LoginInfo();
		AccountInfo accountInfo=entityManager.find(AccountInfo.class, accountNumber);
		CustomerInfo customerDetails=entityManager.find(CustomerInfo.class, accountInfo.getCustomerDetails().getCustomerId());
		
		loginInfo.setAccountInfo(accountInfo);
		loginInfo.setEmailId(customerDetails.getEmailId());
		//loginInfo.setInternetBankingId();  //To be set
		loginInfo.setLastLogin(null);
		loginInfo.setLocked(false);
		loginInfo.setLoginPassword(loginPassword);
		loginInfo.setMobileNumber(customerDetails.getMobileNumber());
		loginInfo.setNumberOfAttemptedLogin(0);
		//loginInfo.setRecoveryInternetBankingId(recoveryInternetBankingId); //To be set
		//loginInfo.setRecoveryLoginPassword(recoveryLoginPassword);  //To be set
	}

	

	
}
