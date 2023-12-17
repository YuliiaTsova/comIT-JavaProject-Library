package org.comit.spring.service;

import java.util.List;

import org.comit.spring.dto.CheckoutDetailsDTO;
import org.comit.spring.dto.PostCheckoutDTO;
import org.comit.spring.entity.Book;
import org.comit.spring.entity.Checkout;
import org.comit.spring.entity.CheckoutDetails;
import org.comit.spring.repository.BookRepository;
import org.comit.spring.repository.CheckoutDetailsRepository;
import org.comit.spring.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

	@Service
	public class CheckoutService {
		 @Autowired
		    private CheckoutDetailsRepository checkoutDetailsRepository;
		 @Autowired
		    private CheckoutRepository checkoutRepository;
		 @Autowired
		    private BookRepository bookRepository;


		    @Autowired
		    private UserService userService;

		    @Autowired
		    private BookService bookService;

		    @Transactional
		    public Checkout saveCheckoutWithDetails(PostCheckoutDTO postCheckoutDTO) {
		    	Checkout checkout = new Checkout();
		    	checkout.setUser(userService.findById((postCheckoutDTO.getUserID())));
		    	
		    	System.out.println(checkout.toString());

		    	Checkout savedCheckout = checkoutRepository.save(checkout);

	    	//Checkout savedCheckout = checkout;

		        for (String detailsDTO : postCheckoutDTO.getBooks()) {
		            CheckoutDetails checkoutDetails = new CheckoutDetails();
		            System.out.println("PASS" + detailsDTO);
		            
		            checkoutDetails.setCheckout(savedCheckout);
		            
		            checkoutDetails.setBook(bookService.getById(Long.parseLong(detailsDTO))); 
		         
		            System.out.println(checkoutDetails.toString());


		            checkoutDetailsRepository.save(checkoutDetails);
		            
		            Book  book = bookRepository.getReferenceById(Long.valueOf(detailsDTO));
		            book.setCopies(0);
		            bookRepository.save(book);
		        }

		        return savedCheckout;
		    }
		    

		
	}
//	{
//	    "userID": 1,
//	    "books": [
//	        "1","10",15
//	    ]
//	}