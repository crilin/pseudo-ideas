package com.exercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHONES")
public class Phone {

	@Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
	
	@Column(name = "NUMBER")
    private String number;
	
	@Column(name = "CITYCODE")
    private String citycode;
	
	@Column(name = "COUNTRYCODE")
    private String countrycode;

	public Phone() { }

	public Phone(String _number, String _citycode, String _countrycode) {
		this.number = _number;
		this.citycode = _citycode;
		this.countrycode = _countrycode;
	}

	public String getNumber() {
		return number;
	}

	public String getcitycode() {
		return citycode;
	}

	public String getcountrycode() {
		return countrycode;
	}

	
}