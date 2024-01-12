package org.comit.spring.controller;

import java.util.List;

import org.comit.spring.dto.BookCategoryDTO;
import org.comit.spring.entity.CheckoutDetails;
import org.comit.spring.service.CheckoutDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile/checkout")
@CrossOrigin(origins = "*")

public class CheckoutDetailsController {

	 @Autowired
	    private CheckoutDetailsService checkoutDetailsService;

//		@GetMapping("")
//		public List<CheckoutDetails> getCheckoutDetails() {
//			//return Optional.of(categoryService.getBooksByCategory2(name)).orElseThrow();
//			return checkoutDetailsService.getCheckoutsDetails();
//		}
//		
	      @GetMapping("")
		  public Page<CheckoutDetails> findAll(
		          @RequestParam(defaultValue = "0") int page,
		          @RequestParam(defaultValue = "3") int size) {
		      Page<CheckoutDetails> result = checkoutDetailsService.getCheckoutsDetails(PageRequest.of(page, size,Sort.by("id").descending()));
		      return  result;
	      }
}
