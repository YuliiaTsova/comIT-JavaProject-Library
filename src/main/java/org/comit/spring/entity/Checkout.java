package org.comit.spring.entity;


//import java.util.Date;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

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
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private  java.sql.Date dueDate = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 14);
	 private int returned;
	 
	 //@Column(name = "data_creation")
	 //@DateTimeFormat(pattern = "yyyy-MM-dd")
	 //private Date creationDate;
	 
	  @Column(name = "creation_date", columnDefinition = "DATE DEFAULT CURRENT_DATE")
	  private java.sql.Date creationDate = new Date(System.currentTimeMillis());
//	  @DateTimeFormat(pattern = "yyyy-MM-dd")
//	  private Date creationDate = new Date();
	 
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "user_id")
	 @JsonBackReference
	 private User user;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public java.sql.Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(java.sql.Date dueDate) {
		this.dueDate = dueDate;
	}


	public int getReturned() {
		return returned;
	}


	public void setReturned(int returned) {
		this.returned = returned;
	}


	public java.sql.Date getCreationDate() {
		return creationDate;
	}


	public void setStartDate(java.sql.Date creationDate) {
		this.creationDate = creationDate;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return String.format("Checkout [id=%s, dueDate=%s, returned=%s, creationDate=%s, user=%s]", id, dueDate, returned,
				creationDate, user);
	}


	public Checkout(long id, Date dueDate, int returned, Date startDate, User user) {
		this.id = id;
		this.dueDate = dueDate;
		this.returned = returned;
		this.creationDate = creationDate;
		this.user = user;
	}


	public Checkout() {
	}
	 
	 
//	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "ckeckout")
//	// @JsonIgnoreProperties(value = { "ckeckout" ,"hibernateLazyInitializer", "handler" }, allowSetters = true)
//	 @JsonManagedReference
//	 private List<Book> books;
	 
//	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
//	 @JoinColumn(name = "book_id")
//	 @JsonBackReference
//	 private Book book;
	 
}
