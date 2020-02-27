package com.exercise.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exercise.model.Phone;

@Repository
public class PhoneDaoImp implements PhoneDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void save(Phone phone) {
      sessionFactory.getCurrentSession().save(phone);
   }

   @Override
   public List<Phone> list() {
      @SuppressWarnings("unchecked")
      TypedQuery<Phone> query = sessionFactory.getCurrentSession().createQuery("SELECT p.* from Phones p");
      return query.getResultList();
   }

}