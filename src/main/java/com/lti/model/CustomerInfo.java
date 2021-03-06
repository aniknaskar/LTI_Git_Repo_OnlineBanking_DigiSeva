package com.lti.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CUSTOMER_DETAILS_TBL")
public class CustomerInfo {


	@Column(name = "TITLE",length = 4,nullable = false)
	private String title;
	
	@Column(name = "FIRST_NAME",length = 30,nullable = false)
	private String firstName;
	
	@Column(name = "MIDDLE_NAME",length = 30,nullable = true)
	private String middleName;
	
	@Column(name = "LAST_NAME",length = 30,nullable = false)
	private String lastName;
	
	@Column(name = "FATHER_NAME",length = 60,nullable = false)
	private String fatherName;
	
	@Column(name = "DOB",nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name = "PERMANENT_ADDRESS_LINE_1",length = 200,nullable = false)
	private String permanentAddressLine1;
	
	@Column(name = "PERMANENT_ADDRESS_LINE_2",length = 200,nullable = true)
	private String permanentAddressLine2;
	
	@Column(name = "PERMANENT_LANDMARK",length = 200,nullable = true)
	private String permanentLandmark;
	
	@Column(name = "PERMANENT_STATE",length = 30,nullable = false)
	private String permanentState; 
	
	@Column(name = "PERMANENT_CITY",length = 30,nullable = false)
	private String permanentCity;
	
	@Column(name = "PERMANENT_PIN2",length = 8,nullable = false)
	private String permanentPin;
	
	@Column(name = "RESIDENTIAL_ADDRESS_LINE_1",length = 200,nullable = false)
	private String residentialAddressLine1;
	
	@Column(name = "RESIDENTIAL_ADDRESS_LINE_2",length = 200,nullable = true)
	private String residentialAddressLine2;
	
	@Column(name = "RESIDENTIAL_LANDMARK",length = 200,nullable = true)
	private String residentialLandmark;
	
	@Column(name = "RESIDENTIAL_STATE",length = 30,nullable = false)
	private String residentialState; 
	
	@Column(name = "RESIDENTIAL_CITY",length = 30,nullable = false)
	private String residentialCity;
	
	@Column(name = "RESIDENTIAL_PIN2",length = 8,nullable = false)
	private String residentialPin;
	
	@Column(name = "OCCUPATION_TYPE",length = 30,nullable = false)
	private String occupationType;
	
	

	@Column(name = "SOURCE_OF_INCOME",length = 50,nullable = false)
	private String sourceOfIncome;
	
	@Column(name = "GROSS_ANNUAL_INCOME",length = 10,nullable = false)
	private String grossAnnualIncome;
	
	@Column(name = "EMAIL_ID",length = 50,nullable = false)
	private String emailId;
	
	@Column(name = "MOBILE_NUMBER",length = 15,nullable = false)
	private String mobileNumber;
	
	@Column(name = "AADHAR_NUMBER",length = 12,nullable = false)
	private String aadharNumber;
	
	@Id
	@Column(name = "CUSTOMER_ID",length = 12,nullable = false)
	private String customerId;
	
	@OneToOne(mappedBy = "customerDetails")
	private AccountInfo accountInfo;
	
	
	public CustomerInfo() {
		super();
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	

	public String getPermanentAddressLine1() {
		return permanentAddressLine1;
	}


	public void setPermanentAddressLine1(String permanentAddressLine1) {
		this.permanentAddressLine1 = permanentAddressLine1;
	}


	public String getPermanentAddressLine2() {
		return permanentAddressLine2;
	}


	public void setPermanentAddressLine2(String permanentAddressLine2) {
		this.permanentAddressLine2 = permanentAddressLine2;
	}


	public String getPermanentLandmark() {
		return permanentLandmark;
	}


	public void setPermanentLandmark(String permanentLandmark) {
		this.permanentLandmark = permanentLandmark;
	}


	public String getPermanentState() {
		return permanentState;
	}


	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}


	public String getPermanentCity() {
		return permanentCity;
	}


	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}


	public String getPermanentPin() {
		return permanentPin;
	}


	public void setPermanentPin(String permanentPin) {
		this.permanentPin = permanentPin;
	}


	public String getResidentialAddressLine1() {
		return residentialAddressLine1;
	}


	public void setResidentialAddressLine1(String residentialAddressLine1) {
		this.residentialAddressLine1 = residentialAddressLine1;
	}


	public String getResidentialAddressLine2() {
		return residentialAddressLine2;
	}


	public void setResidentialAddressLine2(String residentialAddressLine2) {
		this.residentialAddressLine2 = residentialAddressLine2;
	}


	public String getResidentialLandmark() {
		return residentialLandmark;
	}


	public void setResidentialLandmark(String residentialLandmark) {
		this.residentialLandmark = residentialLandmark;
	}


	public String getResidentialState() {
		return residentialState;
	}


	public void setResidentialState(String residentialState) {
		this.residentialState = residentialState;
	}


	public String getResidentialCity() {
		return residentialCity;
	}


	public void setResidentialCity(String residentialCity) {
		this.residentialCity = residentialCity;
	}


	public String getResidentialPin() {
		return residentialPin;
	}


	public void setResidentialPin(String residentialPin) {
		this.residentialPin = residentialPin;
	}


	public String getOccupationType() {
		return occupationType;
	}


	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}


	public String getSourceOfIncome() {
		return sourceOfIncome;
	}


	public void setSourceOfIncome(String sourceOfIncome) {
		this.sourceOfIncome = sourceOfIncome;
	}


	public String getGrossAnnualIncome() {
		return grossAnnualIncome;
	}


	public void setGrossAnnualIncome(String grossAnnualIncome) {
		this.grossAnnualIncome = grossAnnualIncome;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	


	public String getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	
	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	
	


	public AccountInfo getAccountInfo() {
		return accountInfo;
	}


	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	@Override
	public String toString() {
		return "CustomerInfo [title=" + title + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", fatherName=" + fatherName + ", dob=" + dob + ", permanentAddressLine1="
				+ permanentAddressLine1 + ", permanentAddressLine2=" + permanentAddressLine2 + ", permanentLandmark="
				+ permanentLandmark + ", permanentState=" + permanentState + ", permanentCity=" + permanentCity
				+ ", permanentPin=" + permanentPin + ", residentialAddressLine1=" + residentialAddressLine1
				+ ", residentialAddressLine2=" + residentialAddressLine2 + ", residentialLandmark="
				+ residentialLandmark + ", residentialState=" + residentialState + ", residentialCity="
				+ residentialCity + ", residentialPin=" + residentialPin + ", occupationType=" + occupationType
				+ ", sourceOfIncome=" + sourceOfIncome + ", grossAnnualIncome=" + grossAnnualIncome + ", emailId="
				+ emailId + ", mobileNumber=" + mobileNumber + ", aadharNumber=" + aadharNumber + ", customerId="
				+ customerId + ", accountInfo=" + accountInfo + "]";
	}


	
	
	
	
	
}
