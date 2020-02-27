package com.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exercise.dao.PhoneDao;
import com.exercise.model.Phone;

@Service
public class PhoneServiceImp implements PhoneService {

   @Autowired
   private PhoneDao phoneDao;

   @Transactional
   public void save(Phone phone) {
      phoneDao.save(phone);
   }

   @Transactional(readOnly = true)
   public List<Phone> list() {
      return phoneDao.list();
   }
}