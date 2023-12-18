package org.comit.spring.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
@Table (name = "book")
public class Book implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private String cover;
	 private String title;
	 private String author;
	 private String description;
	 private String language;
	 private double rating;
	 private int copies;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "category_id")
	 @JsonBackReference
	 private Category category;
	 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return String.format(
				"Book [id=%s, cover=%s, title=%s, author=%s, description=%s, language=%s, rating=%s, copies=%s, category=%s]",
				id, cover, title, author, description, language, rating, copies, category);
	}

	public Book(long id, String cover, String title, String author, String description, String language, double rating,
			int copies, Category category) {
	
		this.id = id;
		this.cover = cover;
		this.title = title;
		this.author = author;
		this.description = description;
		this.language = language;
		this.rating = rating;
		this.copies = copies;
		this.category = category;
	}

	public Book() {

	}
	 
	
}
