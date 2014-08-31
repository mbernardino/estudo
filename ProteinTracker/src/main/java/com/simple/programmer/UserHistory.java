package com.simple.programmer;

import java.util.Date;

public class UserHistory {
	
	private int id;
	private User user;
	
	private Date entryTime;
	private String entry;

	public UserHistory() {
		super();
	}

	public UserHistory(Date entryTime, String entry) {
		super();
		this.entryTime = entryTime;
		this.entry = entry;
	}

	public int getId() {
		return id;
	}
	public Date getEntryTime() {
		return entryTime;
	}

	public String getEntry() {
		return entry;
	}
	public User getUser() {
		return user;
	}	
	public void setId(int id) {
		this.id = id;
	}
	public void setUser(User user) {
		this.user = user;
	}	
	public void setEntry(String entry) {
		this.entry = entry;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	
	







}