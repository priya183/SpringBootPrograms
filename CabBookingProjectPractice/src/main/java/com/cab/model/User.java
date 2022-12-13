package com.cab.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int userId;
	
	@NotEmpty
	@Size(min=3, message="User name should be minimum of 3 characters.")
	public String userName;
	
	@NotEmpty
	@Size(min =5, max=10, message = "password should have at least 8 characters")
	public String password;
	
	@NotEmpty(message = "EmailId must not be empty")
	@Email
	private String emailId;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	public Date dob;
	
	@NotEmpty(message = "Gender must not be empty")
	public String gender;
	
	@NotEmpty(message = "Address must not be empty")
	public String Address;
	
	@NotEmpty(message = "Mobile number must not be empty")
	public int mobNumber;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(int mobNumber) {
		this.mobNumber = mobNumber;
	}
	public User(int userId,
			@NotEmpty @Size(min = 3, message = "User name should be minimum of 3 characters.") String userName,
			@NotEmpty @Size(min = 5, max = 10, message = "password should have at least 8 characters") String password,
			@NotEmpty @Email String emailId, Date dob, @NotEmpty String gender, @NotEmpty String address,
			@NotEmpty int mobNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.dob = dob;
		this.gender = gender;
		Address = address;
		this.mobNumber = mobNumber;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", emailId=" + emailId
				+ ", dob=" + dob + ", gender=" + gender + ", Address=" + Address + ", mobNumber=" + mobNumber + "]";
	}
	

}
