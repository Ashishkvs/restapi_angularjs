package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.User;

public class UserDAO {

	public List<User> userData() {
		User user = new User();
		List<User> al = new ArrayList<>();
		user.setId(10);
		user.setName("Ashish");
		user.setPassword("abc123");
		al.add(user);
		return al;
	}

}
