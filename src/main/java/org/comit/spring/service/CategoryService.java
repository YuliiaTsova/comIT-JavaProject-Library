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
	
	
	public CategoryBookDTO getBooksByCategory2(String category) {
	return convertEntityToDto(categoryRepository.findByname(category));
	
}
	
	 
	public List<String> getCategories() {
		return categoryRepository.findAll().stream()
				.map(Category::getName)
				.collect(Collectors.toList());
	}
	private CategoryBookDTO convertEntityToDto(Category category) {
		CategoryBookDTO categoryBookDTO = new CategoryBookDTO();
		categoryBookDTO.setName(category.getName());
		categoryBookDTO.setBooks(bookService.convertBooks(category.getBooks()));
    	return categoryBookDTO;
	}
	
	
}
