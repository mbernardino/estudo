package com.simple.programmer;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	private String name;

	private ProteinData proteinData;
	private List<UserHistory> history = new ArrayList<UserHistory>();
	
	public User(){
		setProteinData(new ProteinData());
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public ProteinData getProteinData() {
		return proteinData;
	}
	public List<UserHistory> getHistory() {
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
		proteinData.setUser(this);
	}
	public void setHistory(List<UserHistory> history) {
		this.history = history;
	}	
	
	public void addHistory(UserHistory historyItem){
		historyItem.setUser(this);
		history.add(historyItem);
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
