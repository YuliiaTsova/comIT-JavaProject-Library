package org.comit.spring.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table (name = "user")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 @Column(name = "first_name")
	 private String firstName;
	 @Column(name = "lst_name")
	 private String phone;
	 private String username;
	 private String password;
	 
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	 @JsonIgnoreProperties(value = { "user" ,"hibernateLazyInitializer", "handler" }, allowSetters = true)
	 @JsonManagedReference
	 private List<Checkout> checkouts;
}
