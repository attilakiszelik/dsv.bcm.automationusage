package com.kaev.automationusage.service;

import java.util.List;

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
		
		//TODO
		List<ReportRow> reportRows = null;
		
		return reportRows;
		
	}

}
