package org.comit.spring.dto;

import jakarta.persistence.Column;

public class AddressDTO {
	 private long id;
	 private String street;
	 private String city;
	 private String province;
	 private String postCode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
		return String.format("AddressDTO [id=%s, street=%s, city=%s, province=%s, postCode=%s]", id, street, city,
				province, postCode);
	}
	public AddressDTO(long id, String street, String city, String province, String postCode) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postCode = postCode;
	}
	public AddressDTO() {
	}
	
	
}
