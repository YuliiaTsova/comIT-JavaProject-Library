package org.comit.spring.dto;

import java.util.List;

import org.comit.spring.entity.Book;

public class BookmarkDTO {
	//private Long userID;
	private Long bookId;
	
//	public Long getUserID() {
//		return userID;
//	}
//
//	public void setUserID(Long userID) {
//		this.userID = userID;
//	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return String.format("BookmarkDTO [userID=%s, bookId=%s]", /*userID,*/ bookId);
	}

	public BookmarkDTO(/*Long userID,*/ Long bookId) {
	//	this.userID = userID;
		this.bookId = bookId;
	}

	public BookmarkDTO() {
	}

}
