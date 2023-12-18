package org.comit.spring.controller;

import org.comit.spring.dto.PostCheckoutDTO;
import org.comit.spring.entity.Checkout;
import org.comit.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/checkout")

public class CheckoutController {

	 @Autowired
	    private CheckoutService checkoutService;

	 @ResponseStatus(HttpStatus.OK)
	    @PostMapping("/add")
	    public Checkout placeCheckout(@RequestBody PostCheckoutDTO postCheckoutDTO) {
	      Checkout savedCheckout = checkoutService.saveCheckoutWithDetails(postCheckoutDTO);
	      return savedCheckout;
	    }

}
