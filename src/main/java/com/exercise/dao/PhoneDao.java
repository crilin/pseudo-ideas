package com.exercise.dao;

import java.util.List;

import com.exercise.model.Phone;

public interface PhoneDao {
   void save(Phone phone);
   
   List<Phone> list();
}