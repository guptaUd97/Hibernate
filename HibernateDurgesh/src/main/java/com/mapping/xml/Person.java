package com.mapping.xml;

public class Person {
	
	private int id;
	private String nameString;
	private String addressString;
	private String phoneString;
	public Person(int id, String nameString, String addressString, String phoneString) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.addressString = addressString;
		this.phoneString = phoneString;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public String getPhoneString() {
		return phoneString;
	}
	public void setPhoneString(String phoneString) {
		this.phoneString = phoneString;
	}
	
	

}
