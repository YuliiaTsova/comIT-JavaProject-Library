package org.comit.spring.controller;

import java.util.List;

import org.comit.spring.dto.BookCategoryDTO;
import org.comit.spring.entity.Book;
import org.comit.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<BookCategoryDTO> getTrands (){
		return bookService.getTrands();
	}

	@GetMapping("/books/name")
	public List<Book> getAllBooksWithCategory (@RequestParam String title){
	 return bookService.getByName(title,title);
	}
	
	@GetMapping("/books/{id}") 
	public Book getBookById (@PathVariable String id){
	 return bookService.getById(Long.parseLong(id));
	}
	
	//using query
//	@GetMapping("/category")
//	public List<BookCategoryDTO> getBooksByCategories (@RequestParam String category){
//	 return bookService.getBooksByCategories(category);
//	 
//	 //http://localhost:8080/category?category=Fantasy
//	}
	
//	@GetMapping("/books/name2")
//	public <Book> getAllBooksWithCategory2 (){
//	 bookService.getByName("Eternal Love");
//	 return null;
//	}
	
//	@GetMapping("/booksss")
//	  public List<BookCategoryDTO> findAll(
//	          @RequestParam(defaultValue = "0") int page,
//	          @RequestParam(defaultValue = "3") int size) {
//	      List<BookCategoryDTO> result = bookService.findAllPagin(4.5,PageRequest.of(page, size));
//	      return  bookService.findAllPagin(4.5,PageRequest.of(page, size));
//	     // return result.getContent();

	      @GetMapping("/trands")
		  public Page<BookCategoryDTO> findAll(
		          @RequestParam(defaultValue = "0") int page,
		          @RequestParam(defaultValue = "3") int size) {
		      Page<BookCategoryDTO> result = bookService.getTrandsWithPagination(4.5,PageRequest.of(page, size));
		      return  result;
	  }

}
