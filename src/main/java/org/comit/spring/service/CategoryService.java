package org.comit.spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.comit.spring.dto.CategoryBookDTO;
import org.comit.spring.entity.Category;
import org.comit.spring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	public CategoryBookDTO getBooksByCategory2(String category) {
	return convertEntityToDto(categoryRepository.findByname(category));
	//return Collections.shuffle(convertEntityToDto(categoryRepository.findByname(category)));
	
}
	
	 
	 
	public List<String> getCategories() {
		return categoryRepository.findAll().stream()
				.map(Category::getName)
//				.map(CategoriesDTO::new)
					.collect(Collectors.toList());
//		return categoryRepository.findAll();
	}
	private CategoryBookDTO convertEntityToDto(Category category) {
		CategoryBookDTO categoryBookDTO = new CategoryBookDTO();
		
		//CategoryDTO.setId(category.getId());
		categoryBookDTO.setName(category.getName());
		categoryBookDTO.setBooks(bookService.convertBooks(category.getBooks()));
//		CategoryDTO.setDescription(book.getDescription());
//		bookCategoryDTO.setLanguage(book.getLanguage());
//		bookCategoryDTO.setRating(book.getRating());
//		bookCategoryDTO.setCopies(book.getCopies());
//		bookCategoryDTO.setName(book.getCategory().getName());
		
		return categoryBookDTO;
	}
	
	
}
