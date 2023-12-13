

package org.comit.spring.dto;

public class BookDTO {
	 private long id;
	 private String cover;
	 private String title;
	 private String author;
	 private String description;
	 private String language;
	 private double rating;
	 private int copies;
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
	@Override
	public String toString() {
		return String.format(
				"BookDTO [id=%s, cover=%s, title=%s, author=%s, description=%s, language=%s, rating=%s, copies=%s]", id,
				cover, title, author, description, language, rating, copies);
	}
	public BookDTO(long id, String cover, String title, String author, String description, String language,
			double rating, int copies) {
		this.id = id;
		this.cover = cover;
		this.title = title;
		this.author = author;
		this.description = description;
		this.language = language;
		this.rating = rating;
		this.copies = copies;
	}
	public BookDTO() {
	}
	 
}
