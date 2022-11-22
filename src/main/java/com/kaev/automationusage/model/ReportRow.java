package com.kaev.automationusage.model;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportRow {

	private String project;
	private Map<Integer, Integer> usages;
	private Map<Integer, Integer> users;
	
}
