package com.lti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BENEFICIARY_TBL")
public class BeneficiaryInfo implements Serializable {
	
	

	
	@Column(name = "BENEFICIARY_ACCOUNT_NUMBER",length = 20,nullable = false)
	private String beneficiaryAccountNumber;
	
	@Column(name = "BENEFICIARY_ACCOUNT_NAME",length = 50,nullable = false)
	private String beneficiaryAccountName;
	
	@Column(name = "BENEFICIARY_NICK_NAME",length = 50,nullable = true)
	private String beneficiaryNickName;
	
	@Id
	@Column(name = "SERIAL_NUMBER",length = 10)
	private int serialNumber;
	
	@ManyToOne
	@JoinColumn(name="ACCOUNT_NUMBER")
	private AccountInfo accountNumber;
	
	
	


	public String getBeneficiaryAccountName() {
		return beneficiaryAccountName;
	}


	public void setBeneficiaryAccountName(String beneficiaryAccountName) {
		this.beneficiaryAccountName = beneficiaryAccountName;
	}


	public String getBeneficiaryNickName() {
		return beneficiaryNickName;
	}


	public void setBeneficiaryNickName(String beneficiaryNickName) {
		this.beneficiaryNickName = beneficiaryNickName;
	}


	public AccountInfo getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(AccountInfo accountNumber) {
		this.accountNumber = accountNumber;
	}


	@Override
	public String toString() {
		return "Beneficiary [beneficiaryAccountName=" + beneficiaryAccountName + ", beneficiaryNickName="
				+ beneficiaryNickName + "]";
	}


	public int getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}


	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}
	
	

}
