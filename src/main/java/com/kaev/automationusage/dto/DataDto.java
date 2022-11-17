package com.kaev.automationusage.dto;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDto {

	@Id
	@GeneratedValue
	@EqualsAndHashCode.Include()
	private long id;
	
	private String process;
	private LocalDateTime timestamp;
	private String username;
	
}
