package com.kaev.automationusage.service;

import org.springframework.stereotype.Service;

import com.kaev.automationusage.repository.DataRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DataService {

	private final DataRepository dataRepository;
	
}
