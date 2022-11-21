package com.kaev.automationusage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kaev.automationusage.model.LogEntry;

public interface LogEntryRepository extends JpaRepository<LogEntry, Long>{
	
	@Query(value = "SELECT * FROM AUTOMATIONUSAGE a WHERE LEFT(a.TIMESTAMP,4) = :year", nativeQuery = true)
	List<LogEntry> findAllInYear(@Param("year") String year);
	
}
