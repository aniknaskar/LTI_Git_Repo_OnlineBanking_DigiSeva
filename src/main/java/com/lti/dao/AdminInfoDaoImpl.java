package com.lti.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.lti.model.AdminInfo;


@Repository
public class AdminInfoDaoImpl implements AdminInfoDao {

	EntityManager entityManager=null;
	
	public AdminInfoDaoImpl() {
		
	}
	
	@Override
	public AdminInfo readAdminByAdminId(String adminId) {
		AdminInfo admin=entityManager.find(AdminInfo.class,adminId);
		return admin;
	}

}
