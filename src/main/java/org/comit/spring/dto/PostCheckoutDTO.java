package org.comit.spring.dto;

import java.util.List;

import org.comit.spring.entity.Book;

public class PostCheckoutDTO {
	private Long userID;
	private List<String> books;
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
//	public List<Book> getBooks() {
//		return books;
//	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return String.format("PostCheckoutDTO [userID=%s, books=%s]", userID, books);
	}
	public PostCheckoutDTO(Long userID, List<String> books) {
		this.userID = userID;
		this.books = books;
	}
	public PostCheckoutDTO() {
	}

}
