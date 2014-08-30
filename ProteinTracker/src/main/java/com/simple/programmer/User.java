package com.simple.programmer;

import java.util.HashSet;
import java.util.Set;

public class User {

	private int id;
	private String name;

	private ProteinData proteinData = new ProteinData();
	private Set<UserHistory> history = new HashSet<UserHistory>();
	
	public User(){super();}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public ProteinData getProteinData() {
		return proteinData;
	}
	public Set<UserHistory> getHistory() {
		return history;
	}	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProteinData(ProteinData proteinData) {
		this.proteinData = proteinData;
	}
	public void setHistory(Set<UserHistory> history) {
		this.history = history;
	}	
	
	@Override
	public String toString(){
		return(
				"ID: " + id + "\r\n" +
				"Name: " + name + "\r\n" +
				"Total: " + getProteinData().getTotal() + "\r\n" +
				"Goal: " + getProteinData().getGoal() + "\r\n"
				);
	}




	
	
}
