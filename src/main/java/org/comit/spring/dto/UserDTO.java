package org.comit.spring.dto;

import jakarta.persistence.Column;

public class UserDTO {
	 private String firstName;
	 private String lastName;
	 private String phone;
	 private String username;
	// private String password;
	 private String street;
	 private String city;
	 private String province;
	 private String postCode;

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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	@Override
	public String toString() {
		return String.format(
				"UserDTO [firstName=%s, lastName=%s, phone=%s, username=%s, street=%s, city=%s, province=%s, postCode=%s]",
				firstName, lastName, phone, username, street, city, province, postCode);
	}


	public UserDTO(String firstName, String lastName, String phone, String username, String street, String city,
			String province, String postCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.username = username;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postCode = postCode;
	}
	public UserDTO() {
	}

	 
}
