package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repositories.LanguageRepository;

@Service
public class LanguageService {

	@Autowired
	private LanguageRepository service;
	
}
