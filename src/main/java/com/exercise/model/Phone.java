package com.exercise.model;

public class Phone {

	private String number;
	private String citycode;
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