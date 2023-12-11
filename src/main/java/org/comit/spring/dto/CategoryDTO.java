package org.comit.spring.dto;

import java.util.List;

import org.comit.spring.entity.Book;

public class CategoryDTO {
	 private long id;
	 private String name;
	 private List<BookCategoryDTO> books;
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<BookCategoryDTO> getBooks() {
		return books;
	}
	public void setBooks(List<BookCategoryDTO> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return String.format("CategoryDTO [id=%s, name=%s, books=%s]", id, name, books);
	}
	public CategoryDTO(long id, String name, List<BookCategoryDTO> books) {
		this.id = id;
		this.name = name;
		this.books = books;
	}
	public CategoryDTO() {
	}	
	 
}
