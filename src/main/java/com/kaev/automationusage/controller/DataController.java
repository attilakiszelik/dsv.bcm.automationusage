package com.kaev.automationusage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaev.automationusage.service.DataService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/automationusage")
@RequiredArgsConstructor
public class DataController {

	private final DataService dataService;
	
	@GetMapping
	public String getData() {
		
		return "";
		
	}
	
}
