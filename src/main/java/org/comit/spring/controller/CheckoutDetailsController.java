package org.comit.spring.controller;

import java.util.List;

import org.comit.spring.entity.CheckoutDetails;
import org.comit.spring.service.CheckoutDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile/checkout")

public class CheckoutDetailsController {

	 @Autowired
	    private CheckoutDetailsService checkoutDetailsService;

		@GetMapping("")
		public List<CheckoutDetails> getCheckoutDetails() {
			//return Optional.of(categoryService.getBooksByCategory2(name)).orElseThrow();
			return checkoutDetailsService.getCheckoutsDetails();
		}
}
