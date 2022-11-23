package com.kaev.automationusage.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.kaev.automationusage.model.LogEntry;
import com.kaev.automationusage.model.ReportRow;
import com.kaev.automationusage.repository.LogEntryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReportService {

	private final LogEntryRepository logEntryRepository;
	
	public List<ReportRow> createReport(String year){
		
		List<LogEntry> logEntries = logEntryRepository.findAllInYear(year);
		
		System.out.println(logEntries.size());
		
		List<ReportRow> reportRows = new ArrayList<ReportRow>();;
		//TODO
		
		return reportRows;
		
	}

	public ReportRow initializeNewRepotRow(String project) {
		
		List<Integer> usages = new ArrayList<Integer>();
			for (int i=0; i<=11; i++)
				usages.add(0);
		Map<Integer, List<String>> users = new HashMap<Integer, List<String>>();
			for (int i=0; i<=11; i++)
				users.put(i, new ArrayList<String>());
		return new ReportRow(project,usages,users);
		
	}

}
