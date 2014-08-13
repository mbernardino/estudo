package br.com.jm.spring.ioc.beans.person;

import java.util.List;
import java.util.Map;

public class Person {

	private String name;
	private int age;
	private List<String> hobbies;
	private Map<String, String> otherAtributes;
	
	
	public Map<String, String> getOtherAtributes() {
		return otherAtributes;
	}
	
	public void setOtherAtributes(Map<String, String> otherAtributes) {
		this.otherAtributes = otherAtributes;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<String> getHobbies() {
		return hobbies;
	}
	
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	public String toString(){
		String s = "Name: " + name + "\r\n" + 
					"Age: " + age + "\r\n" + 
					"Hobbies: " + hobbies + "\r\n" +
					"Other Atributes: " + otherAtributes + "\n";
		return s;
	}
	
}
