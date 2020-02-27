package com.exercise.dao;

import com.exercise.model.User;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImp implements UserDao {

	@Autowired
    private SessionFactory sessionFactory;
 
    @Override
   	public void save(User _user) {
      sessionFactory.getCurrentSession().save(_user);
   	}   
   
   	@Override
   	public List<User> list() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
   	}


}