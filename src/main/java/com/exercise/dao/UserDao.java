package com.exercise.dao;

import com.exercise.model.User;
import java.util.List;

public interface UserDao {
	
	public void save(User user);

	//public void get(Long index);

	//public void delete(User user);

	List<User> list();
}