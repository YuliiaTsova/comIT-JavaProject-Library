package org.comit.spring.dto;

import java.util.List;

import org.comit.spring.entity.Book;

public class BookmarkWithId {
	private Long id;
	private Long bookId;
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
	@Override
	public String toString() {
		return String.format("BookmarkWithId [id=%s, bookId=%s]", id, bookId);
	}
	public BookmarkWithId(Long id, Long bookId) {
		this.id = id;
		this.bookId = bookId;
	}
	public BookmarkWithId() {
	}
	


	
}
