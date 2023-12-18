package org.comit.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table (name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private String street;
	 private String city;
	 private String province;
	 @Column(name = "post_code")
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
		return String.format("Address [id=%s, street=%s, city=%s, province=%s, postCode=%s]", id, street, city,
				province, postCode);
	}
	public Address(long id, String street, String city, String province, String postCode) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postCode = postCode;
	}
	public Address() {
	}
	 
}
