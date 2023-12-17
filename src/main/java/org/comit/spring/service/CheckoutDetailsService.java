package org.comit.spring.service;

import java.util.List;

import org.comit.spring.dto.CheckoutDetailsDTO;
import org.comit.spring.dto.PostCheckoutDTO;
import org.comit.spring.entity.Book;
import org.comit.spring.entity.Checkout;
import org.comit.spring.entity.CheckoutDetails;
import org.comit.spring.repository.CheckoutDetailsRepository;
import org.comit.spring.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutDetailsService {
		@Autowired
	    private CheckoutDetailsRepository checkoutDetailsRepository;
	 	@Autowired
	    private CheckoutService checkoutService;
	    @Autowired
	    private BookService bookService;

	    public List<CheckoutDetails> getCheckoutsDetails (){
	    	//List<Checkout> = checkoutRepository.getByUser(1L);
	    	//CheckoutDetailsDTO  checkoutDetailsDTO = new CheckoutDetailsDTO();
	    	return checkoutDetailsRepository.getByUser(1L)	;
	    }
}
