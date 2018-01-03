package com.demo.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.UserDAO;
import com.demo.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/name")
	public List<User> userData(){
		UserDAO user=new UserDAO();
		
		return user.userData();
	}

}
