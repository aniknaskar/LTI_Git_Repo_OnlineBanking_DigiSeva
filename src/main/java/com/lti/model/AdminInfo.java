package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN_TBL")
public class AdminInfo {

	@Id
	@Column(name = "ADMIN_ID",length = 10,nullable = false)
	private int adminId;
	
	@Column(name = "ADMIN_PASSWORD",length = 20,nullable = false)
	private String adminPassword;
	
	
	
	public AdminInfo() {
		super();
	}



	public AdminInfo(int adminId, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminPassword = adminPassword;
	}



	public int getAdminId() {
		return adminId;
	}



	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}



	public String getAdminPassword() {
		return adminPassword;
	}



	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}



	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPassword=" + adminPassword + "]";
	}
	
	
	
	
}
