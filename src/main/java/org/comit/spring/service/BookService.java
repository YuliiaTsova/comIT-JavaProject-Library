package org.comit.spring.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.comit.spring.dto.BookCategoryDTO;
import org.comit.spring.entity.Book;
import org.comit.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	 public Page<BookCategoryDTO> getTrandsWithPagination(double rating, Pageable pageable) {
		 Page<BookCategoryDTO> bookCategoryDTO = bookRepository.findAllByratingGreaterThan(rating,pageable)
					.map(this::convertEntityToDto);
			return bookCategoryDTO;
	 }

	
	public List<BookCategoryDTO> getTrands() {
	List<BookCategoryDTO> bookCategoryDTO = bookRepository.getFindByratingGreaterThan(4.5).stream()
			.map(this::convertEntityToDto)
			.limit(10)
			.collect(Collectors.toList());
	Collections.shuffle(bookCategoryDTO);
	return bookCategoryDTO;
	
}
	
//	public Book getByName(String title, String author ) {
//		return bookRepository.findByTitleContainingOrAuthorContaining(title ,author);
//	}
	
	public List<Book> getByName(String title, String author ) {
		return bookRepository.findByTitleContainingOrAuthorContaining(title ,author);
	}
	
	public Book getById(Long id ) {
		return bookRepository.getReferenceById(id);
	}
	

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
	
	public List<BookCategoryDTO> convertBooks(List<Book> books) {
		return books.stream().map(b -> convertEntityToDto(b)).collect(Collectors.toList());
	}
}
