package com.exercise.service;

import java.util.List;

import com.exercise.model.Phone;

public interface PhoneService {
   void save(Phone phone);

   List<Phone> list();
}