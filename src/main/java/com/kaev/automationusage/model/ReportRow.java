package com.kaev.automationusage.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportRow {

	private String project;
	private List<Integer> usages;
	private Map<Integer, List<String>> users;
	
	public int getUsagesInTheMonth(int index) {
		return this.usages.get(index);
	}
	
	public void setUsagesInTheMonth(int index, int value) {
		this.usages.set(index, value);
	}

	public List<String> getUsersInTheMonth(int index) {
		return this.users.get(index);
	}
	
	public void setUsersInTheMonth(int index, String user) {
		
		List<String> actualUsersInTheMonth = this.users.get(index);
		actualUsersInTheMonth.add(user);
		this.users.put(index, actualUsersInTheMonth);
		
	}
	
	public int getNumberOfUsersInTheMonth(int index) {
		
		List<String> actualUsersInTheMonth = this.users.get(index);
		return actualUsersInTheMonth.size();
		
	}
}
