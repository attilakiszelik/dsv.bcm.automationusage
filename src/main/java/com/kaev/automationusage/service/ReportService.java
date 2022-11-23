package com.kaev.automationusage.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

		List<ReportRow> reportRows = new ArrayList<ReportRow>();;
		
		logEntries.forEach(l -> {
			
			//miden sor esetében a szükséges változók rögzítése
			String project = l.getProject();
			int month = Integer.parseInt(l.getTimestamp().substring(4,6));
			int index = month-1;
			String user = l.getUsername();
			
			Optional<ReportRow> existingReportRow = reportRows.stream().filter(r -> r.getProject().equals(project)).findFirst();
			
			if (existingReportRow.isPresent()) {
				
				ReportRow r = existingReportRow.get();
				
				//használat növelée
				r.setUsagesInTheMonth(index, r.getUsagesInTheMonth(index) + 1); 
				//használó hozzáadása, ha még nem szerepel
				if(!r.getUsersInTheMonth(index).contains(user)) {
					r.setUsersInTheMonth(index, user);
				}	
				
			} else {
				
				//ha a projektnek nincs még riport sora
				ReportRow newReportRow = initializeNewRepotRow();
				newReportRow.setProject(project);
				newReportRow.setUsagesInTheMonth(index, 1);
				newReportRow.setUsersInTheMonth(index, user);
				reportRows.add(newReportRow);
				
			}
			
		});
		
		return reportRows;
		
	}

	public ReportRow initializeNewRepotRow() {
		
		List<Integer> usages = new ArrayList<Integer>();
			for (int i=0; i<=11; i++)
				usages.add(0);
		Map<Integer, List<String>> users = new HashMap<Integer, List<String>>();
			for (int i=0; i<=11; i++)
				users.put(i, new ArrayList<String>());
		return new ReportRow("",usages,users);
		
	}

}
