package com.quiz.application;


public class StudentRegistration {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	private String city;
	private String mailId;
	private long mobileNumber;
	private long aadharId;
	
	/*public long getAadharId() {
		return aadharId;
	}*/
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber (long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
