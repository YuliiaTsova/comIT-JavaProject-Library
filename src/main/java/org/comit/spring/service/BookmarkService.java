package org.comit.spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.comit.spring.dto.BookmarkDTO;
import org.comit.spring.dto.BookmarkWithId;
import org.comit.spring.entity.Bookmark;
import org.comit.spring.repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookmarkService {
	 @Autowired
	    private BookmarkRepository bookmarkRepository;


	    @Autowired
	    private UserService userService;
	
	    @Autowired
	    private BookService bookService;
	    public Bookmark addBookmark(BookmarkDTO bookmarkDTO) {
	    	Bookmark bookmark = new Bookmark();
	    	//bookmark.setUser(userService.findById((bookmarkDTO.getUserID())));
	    	bookmark.setUser(userService.findById(1L));
	    	bookmark.setBook(bookService.getById((bookmarkDTO.getBookId())));
	    	
	    	//System.out.println(checkout.toString());

	    	Bookmark savedBookmark = bookmarkRepository.save(bookmark);

    	

	        return savedBookmark;
	    }
	    
//	    public List<Bookmark> getBookmarks() {
//	    	return bookmarkRepository.getByUser(1L);
//	    }

	    public List<BookmarkWithId> getBookmarks() {
	    	//return bookmarkRepository.getByUser(1L).stream().map(el -> el.getBook().getId()).collect(Collectors.toList());  
	    	return bookmarkRepository.getByUser(1L).stream().map(el -> new BookmarkWithId(el.getId(),el.getBook().getId(),el.getBook().getCover(),el.getBook().getAuthor(),el.getBook().getTitle(),el.getBook().getCopies())).collect(Collectors.toList());  
	    }
	    
	    public void deleteBookmark(String id) {
	    	bookmarkRepository.deleteById(Long.valueOf(id));
	    }
}
