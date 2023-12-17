package org.comit.spring.repository;

import java.util.List;

import org.comit.spring.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {

	
}
