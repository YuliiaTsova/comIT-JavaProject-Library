package org.comit.spring.repository;

import java.util.List;

import org.comit.spring.entity.Checkout;
import org.comit.spring.entity.CheckoutDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CheckoutDetailsRepository extends JpaRepository<CheckoutDetails, Long>{

	
	@Query(value = "select d.id , d.book_id, c.id as checkout_id  from checkout_details d \r\n"
			+ "	join checkout c on d.checkout_id = c.id \r\n"
			+ "	join user u on u.id = c.user_id  where u.id = ?1",
	nativeQuery = true)
	List<CheckoutDetails> getByUser(Long id);
}
