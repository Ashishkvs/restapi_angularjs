package com.demo.service;

import java.util.List;

import com.demo.dao.UserDAO;
import com.demo.model.User;

public class UserService {
	
	public List<User> userData(){
		UserDAO user=new UserDAO();
		
		return user.userData();
	}

}
