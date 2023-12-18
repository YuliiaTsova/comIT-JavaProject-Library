package org.comit.spring.controller;

import java.util.List;

import org.comit.spring.dto.CategoryBookDTO;
import org.comit.spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	//http://localhost:8080/books/category?name=Fantasy
//	@GetMapping("/books/category")
//	public List<Category> getByName(@RequestParam String name) {
//	 return categoryService.getBooksByCategory(name);
//	}
	
	//http://localhost:8080/books/category?name=Fantasy
	@GetMapping("/books/category")
	public CategoryBookDTO getBooksByCategory(@RequestParam String name) {
		return categoryService.getBooksByCategory2(name);

	}
	

	@GetMapping("/categories")
	public List<String> getAllGategoriesNames() {
		return categoryService.getCategories();
	}

}
