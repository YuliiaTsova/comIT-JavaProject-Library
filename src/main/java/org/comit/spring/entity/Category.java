package org.comit.spring.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table (name = "category")
public class Category {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	 private long id;
	 private String name;
	 ////////////
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
	 @JsonIgnoreProperties(value = { "category" ,"hibernateLazyInitializer", "handler" }, allowSetters = true)
	 @JsonManagedReference
	 private List<Book> books;
		public List<Book> getBooks() {
			return books;
		}
		public void setBooks(List<Book> books) {
			this.books = books;
			}
	 ////////////
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("Category [id=%s, name=%s]", id, name);
	}
	public Category(long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Category() {
	}
	 
	 
}
