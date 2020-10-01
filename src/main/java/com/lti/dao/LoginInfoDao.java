package com.lti.dao;

import com.lti.model.LoginInfo;

public interface LoginInfoDao {

	public LoginInfo readLoginInfo(String internetBankingId);
	public void updateLoginPassword(String newloginPassword,String internetBankingId);
	public void createInternetBanking(String accountNumber,String loginPassword);
	
	
}
