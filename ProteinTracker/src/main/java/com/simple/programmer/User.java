package com.simple.programmer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

	private int id;
	private String name;

	private ProteinData proteinData = new ProteinData();
	private Map<String, UserHistory> history = new HashMap<String, UserHistory>();
	
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
	public Map<String, UserHistory> getHistory() {
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
	public void setHistory(Map<String, UserHistory> history) {
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
