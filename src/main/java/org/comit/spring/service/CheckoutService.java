package org.comit.spring.service;

import java.time.LocalDateTime;
import java.util.Date;

import org.comit.spring.dto.PostCheckoutDTO;
import org.comit.spring.entity.Book;
import org.comit.spring.entity.Checkout;
import org.comit.spring.entity.CheckoutDetails;
import org.comit.spring.repository.CheckoutDetailsRepository;
import org.comit.spring.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	public class CheckoutService {
		 @Autowired
		    private CheckoutDetailsRepository checkoutDetailsRepository;
		 @Autowired
		    private CheckoutRepository checkoutRepository;


		    @Autowired
		    private UserService userService;

		    @Autowired
		    private BookService bookService;

		    public Checkout saveCheckoutWithDetails(PostCheckoutDTO postCheckoutDTO) {
		    	Checkout checkout = new Checkout();
		    	checkout.setUser(userService.findById((postCheckoutDTO.getUserID())));
		    	
		    	System.out.println(checkout.toString());

		    	System.out.println("PASS1");
		        // Set other order-related fields based on orderDTO
		    	Checkout savedCheckout = checkoutRepository.save(checkout);

	    	//Checkout savedCheckout = checkout;
		    	System.out.println("PASS");
		        // Save order details
		        for (String detailsDTO : postCheckoutDTO.getBooks()) {
		            CheckoutDetails checkoutDetails = new CheckoutDetails();
		            System.out.println("PASS" + detailsDTO);
		            
		            checkoutDetails.setCkeckout(savedCheckout);
		            
		            checkoutDetails.setBook(bookService.getById(Long.parseLong(detailsDTO))); // Assuming ProductService has a method findById
		         
		            System.out.println(checkoutDetails.toString());

		            // Set other order details-related fields based on detailsDTO
		            checkoutDetailsRepository.save(checkoutDetails);
		        }

		        return savedCheckout;
		    }
	}

//	 @Autowired
//	    private CheckoutRepository checkoutRepository;
//	 
//	   @Autowired
//	    private UserService userService;
//
//	    public Checkout saveCheckout(PostCheckoutDTO postCheckoutDTO) {
//	    	Checkout checkout = new Checkout();
//	    	checkout.setUser(userService.findById(postCheckoutDTO.getUserID()));
//	    			//postCheckoutDTO.getUser().getId())); // Assuming UserService has a method findById
//
//
//	        return checkoutRepository.save(checkout);
//	    }
//}
