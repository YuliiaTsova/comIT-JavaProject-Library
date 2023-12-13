package org.comit.spring.service;

import org.comit.spring.entity.User;
import org.comit.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	 @Autowired
	 private UserRepository userRepository;

	public User findById(Long userID) {
		return userRepository.getReferenceById(userID);
	}

}
