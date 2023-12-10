package org.comit.spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.comit.spring.dto.BookCategoryDTO;
import org.comit.spring.entity.Book;
import org.comit.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public List<BookCategoryDTO> getAllBooksCategory() {
		return bookRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
		
	}
	
	public Book getByName(String title ) {
		return bookRepository.findBytitle(title);
	}
	
	public Book getById(Long id ) {
		return bookRepository.getReferenceById(id);
	}
	
//	public List<BookCategoryDTO> getBooksByCategories( ) {
//		return bookRepository.getBooksByCategories();
//	}
	
	public List<BookCategoryDTO> getBooksByCategories(String category) {
		return bookRepository.getBooksByCategories(category).stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
		
	}
	
//	public List<BookCategoryDTO> getSortBooks(String field){
//		return bookRepository.findAll(Sort.by(Sort.Direction.ASC),field);
//	Collections.sort(bookRepository.findAll(), Direction.ASK);
//		
//	}
	private BookCategoryDTO convertEntityToDto(Book book) {
		BookCategoryDTO bookCategoryDTO = new BookCategoryDTO();
		
		bookCategoryDTO.setBookId(book.getId());
		bookCategoryDTO.setCover(book.getCover());
		bookCategoryDTO.setTitle(book.getTitle());
		bookCategoryDTO.setAuthor(book.getAuthor());
		bookCategoryDTO.setDescription(book.getDescription());
		bookCategoryDTO.setLanguage(book.getLanguage());
		bookCategoryDTO.setRating(book.getRating());
		bookCategoryDTO.setCopies(book.getCopies());
		bookCategoryDTO.setName(book.getCategory().getName());
		
		return bookCategoryDTO;
		
		
	}
	
	
}
