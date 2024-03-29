package org.comit.spring.controller;

import org.comit.spring.dto.UserDTO;
import org.comit.spring.entity.LoginForm;
import org.comit.spring.entity.User;
import org.comit.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	 @Autowired
	    private UserService userService;

	 @ResponseStatus(HttpStatus.OK)
	 @PostMapping("/login")
	    public String Login(@RequestBody LoginForm loginForm) {

		 System.out.println(loginForm.toString());
		User user =  userService.findByUsernamePassword(loginForm.getUsername(),loginForm.getPassword());
	         
	            return user.getUsername();
	    }
	 
	 @GetMapping("profile/info")
	    public UserDTO getBookmarks (){
		  User user = userService.findById(1L);
				return new UserDTO(user.getFirstName(),user.getLastName(),user.getPhone(),user.getUsername(),user.getAddress().getStreet(),user.getAddress().getCity(),user.getAddress().getProvince(),user.getAddress().getPostCode());// findByUsername());
			}
}
