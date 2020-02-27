package com.exercise.service;

import com.exercise.model.User;
import java.util.List;

public interface UserService {
	
	void save(User user);

   	List<User> list();
}