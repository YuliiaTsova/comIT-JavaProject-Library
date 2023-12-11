package org.comit.spring.service;

import java.util.Collections;

import org.comit.spring.dto.CategoryDTO;
import org.comit.spring.entity.Category;
import org.comit.spring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
	@Autowired
    private CategoryRepository categoryRepository;
	
	@Autowired
	private BookService bookService;
	
	//using query
//	public List<Category> getBooksByCategory (String category) {
//		return categoryRepository.findByname(category);
//	}
	
//	public List<CategoryDTO> getBooksByCategory2(String category) {
//		return categoryRepository.findByname(category).stream()
//				.map(this::convertEntityToDto)
//				.collect(Collectors.toList());
//		
//	}
	
	public CategoryDTO getBooksByCategory2(String category) {
	return convertEntityToDto(categoryRepository.findByname(category));
	//return Collections.shuffle(convertEntityToDto(categoryRepository.findByname(category)));
	
}
	
	private CategoryDTO convertEntityToDto(Category category) {
		CategoryDTO categoryDTO = new CategoryDTO();
		
		//CategoryDTO.setId(category.getId());
		categoryDTO.setName(category.getName());
		categoryDTO.setBooks(bookService.convertBooks(category.getBooks()));
//		CategoryDTO.setDescription(book.getDescription());
//		bookCategoryDTO.setLanguage(book.getLanguage());
//		bookCategoryDTO.setRating(book.getRating());
//		bookCategoryDTO.setCopies(book.getCopies());
//		bookCategoryDTO.setName(book.getCategory().getName());
		
		return categoryDTO;
	}
}
