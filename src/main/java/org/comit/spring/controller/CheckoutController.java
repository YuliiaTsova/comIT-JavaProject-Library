package org.comit.spring.controller;

import java.util.Arrays;

import org.comit.spring.dto.PostCheckoutDTO;
import org.comit.spring.entity.Checkout;
import org.comit.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

	 @Autowired
	    private CheckoutService checkoutService;

	    @PostMapping("/add")
	    public Checkout placeCheckout(@RequestBody PostCheckoutDTO postCheckoutDTO) {
	 //      try {
	            Checkout savedCheckout = checkoutService.saveCheckoutWithDetails(postCheckoutDTO);
	         //   return Checkout.ok("Order with ID " + savedCheckout.getId() + " and details saved successfully.");
	      //  } catch (Exception e) {
	      //      return Checkout.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving order and details: " + e.getMessage());
	     //   }
	            return savedCheckout;
	    }

}
