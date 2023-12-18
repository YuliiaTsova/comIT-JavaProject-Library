package org.comit.spring.controller;

import java.util.List;

import org.comit.spring.dto.BookmarkDTO;
import org.comit.spring.dto.BookmarkWithId;
import org.comit.spring.entity.Bookmark;
import org.comit.spring.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")

public class BookmarkController {

	 @Autowired
	    private BookmarkService bookmarkService;

	 
	 @ResponseStatus(HttpStatus.OK)
	    @PostMapping("/bookmark")
	    public BookmarkWithId addBookmark(@RequestBody BookmarkDTO bookmarkDTO) {
	    	
		 Bookmark savedBookmark = bookmarkService.addBookmark(bookmarkDTO);
		 BookmarkWithId bookmarkWithId = new BookmarkWithId(savedBookmark.getId(),savedBookmark.getBook().getId(),savedBookmark.getBook().getCover(),savedBookmark.getBook().getAuthor(),savedBookmark.getBook().getTitle(),savedBookmark.getBook().getCopies());
	            return bookmarkWithId;
	    }
	 
	    @GetMapping("/bookmark")

	    public List<BookmarkWithId> getBookmarks (){
				return bookmarkService.getBookmarks();
			}
	    
	    @DeleteMapping("/bookmark/{id}")
	    public void deleteBookmark(@PathVariable String id)
	    {
	       bookmarkService.deleteBookmark(id);
	        
	    }

}
