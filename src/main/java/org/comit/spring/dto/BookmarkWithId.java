package org.comit.spring.dto;

import java.util.List;

import org.comit.spring.entity.Book;

public class BookmarkWithId {
	private Long id;
	private Long bookId;
	/////
	private String cover;
	private String author;
	private String title;
	private int copies;
	////
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public BookmarkWithId() {
	}
	/////////////
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return String.format("BookmarkWithId [id=%s, bookId=%s, cover=%s, author=%s, title=%, copies=%s]", id, bookId, cover,
				author, title, copies);
	}
	public BookmarkWithId(Long id, Long bookId, String cover, String author, String title, int copies) {
		this.id = id;
		this.bookId = bookId;
		this.cover = cover;
		this.author = author;
		this.title = title;
		this.copies = copies;
	}
	
	
	


	
}
