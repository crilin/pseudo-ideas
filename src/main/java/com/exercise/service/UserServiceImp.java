package com.exercise.service;

import com.exercise.model.User;
import com.exercise.dao.UserDao;
//import com.exercise.service.UserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional(readOnly = true)
	public List<User> list() {
		return userDao.list();
	}

	@Transactional
	public void save(User _user) {
		userDao.save(_user);
	}

}