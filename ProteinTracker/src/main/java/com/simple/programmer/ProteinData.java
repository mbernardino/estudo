package com.simple.programmer;

public class ProteinData {
	
	private int id;
	private User user;
	private int total;
	private int goal;
	
	public ProteinData() {super();}
	
	public int getId() {
		return id;
	}	
	public User getUser() {
		return user;
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
	public void setUser(User user) {
		this.user = user;
	}	
	public void setTotal(int total) {
		this.total = total;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + goal;
		result = prime * result + total;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProteinData other = (ProteinData) obj;
		if (goal != other.goal)
			return false;
		if (total != other.total)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProteinData [total=" + total + ", goal=" + goal + "]";
	}




	
	
	
	
}
