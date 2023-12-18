package org.comit.spring.repository;

import java.util.List;

import org.comit.spring.entity.Book;
import org.comit.spring.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	 
		 Category findByname(String category);
		 List<Category> findAll();
	
}
