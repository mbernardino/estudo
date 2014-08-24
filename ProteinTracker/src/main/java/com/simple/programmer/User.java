package com.simple.programmer;

public class User {

	private int id;
	private String name;
	private int total;
	private int goal;
	
	public User(){super();}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getTotal() {
		return total;
	}
	public int getGoal() {
		return goal;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	
	public String toString(){
		return(
				"ID: " + id + "\r\n" +
				"Name: " + name + "\r\n" +
				"Total: " + total + "\r\n" +
				"Goal: " + goal + "\r\n"
				);
	}
	
}
