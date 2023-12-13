package org.comit.spring.dto;

import jakarta.persistence.Column;

public class UserDTO {
	 private Long id;
	 private String firstName;
	 private String lastName;
	 private String phone;
	 private String username;
	 private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("UserDTO [id=%s, firstName=%s, lastName=%s, phone=%s, username=%s, password=%s]", id,
				firstName, lastName, phone, username, password);
	}
	public UserDTO(Long id, String firstName, String lastName, String phone, String username, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}
	public UserDTO() {
	}

	 
}
