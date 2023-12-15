package org.comit.spring.repository;

import java.util.List;

import org.comit.spring.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	//List<Bookmark> getByUser(Long id);
	
	@Query(value = "select * from bookmark where user_id = ?1",
			nativeQuery = true)
	List<Bookmark> getByUser(Long id);
	
	void deleteById(Long id);
}
