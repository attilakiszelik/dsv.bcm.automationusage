package com.kaev.automationusage.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportRow {

	private String project;
	private List<OneMonthsData> monthsData;
	
}
