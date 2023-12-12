package org.comit.spring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table (name = "checkout")
public class Checkout {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 @Column(name = "due_date")
	 private String dueDate;
	 private int returned;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "user_id")
	 @JsonBackReference
	 private User user;
	 
//	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
//	 @JoinColumn(name = "book_id")
//	 @JsonBackReference
//	 private Book book;
}
