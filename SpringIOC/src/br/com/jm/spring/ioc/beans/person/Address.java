package br.com.jm.spring.ioc.beans.person;

public class Address {
		
	private String street;
	private int number;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString(){
		String s = "\t Street: " + street + "\r\n" +
					"\t Number: " + number + "\t\n";
		return s;
	}
	
}
