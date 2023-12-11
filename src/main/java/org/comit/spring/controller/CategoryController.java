package org.comit.spring.controller;

import java.util.List;
import java.util.Optional;

import org.comit.spring.dto.CategoryDTO;
import org.comit.spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
	public CategoryDTO getBooksByCategory(@RequestParam String name) {
		//return Optional.of(categoryService.getBooksByCategory2(name)).orElseThrow();
		return categoryService.getBooksByCategory2(name);
//	 return categoryService.getBooksByCategory2(name);
	}

}
