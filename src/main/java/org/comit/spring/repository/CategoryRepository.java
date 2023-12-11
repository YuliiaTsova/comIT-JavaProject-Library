package org.comit.spring.repository;

import java.util.List;

import org.comit.spring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	////
//		 List<Category> findByname(String category);
		 
		 Category findByname(String category);
		 List<Category> findAll();
		
	//////////////////////
	

}
