package com.kaev.automationusage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kaev.automationusage.service.ReportService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/automationusage")
@RequiredArgsConstructor
public class MainController {

	private final ReportService reportService;

	@GetMapping()
	public String home() {
		
		return "home";
		
	}
	
	@GetMapping("/createReport")
	public String createReport(@RequestParam String year, Model model) {
		
		System.out.println(year);
		
		model.addAttribute("reportRows", reportService.createReport(year));
		
		return "report";
		
	}
	
}