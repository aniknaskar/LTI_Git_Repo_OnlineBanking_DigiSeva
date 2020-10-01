package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.UserInfoDao;
import com.lti.model.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void addUser(UserInfo userInfo) {

		long serviceRefNum=(long)(Math.random()*100000000);
		String servRefNumString=Long.toString(serviceRefNum);
		userInfo.setServiceRefNumber(servRefNumString);
		userInfo.setVerifyStatus("UNVERIFIED");
		userInfoDao.createUser(userInfo);
		
		
	}

	
}
