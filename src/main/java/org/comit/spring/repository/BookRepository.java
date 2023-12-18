package org.comit.spring.repository;

import java.util.List;

import org.comit.spring.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	//Book findBytitle(String title);
	List<Book> findByTitleContainingOrAuthorContaining(String title,String author);
	Book getReferenceById(Long id);
	List<Book> getFindByratingGreaterThan(double rating);
	//Book findByname(String name);
	//for pagination
	Page<Book> findAllByratingGreaterThan(double rating,Pageable pageable);
	

}
