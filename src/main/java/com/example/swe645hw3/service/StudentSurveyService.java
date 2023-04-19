package com.example.swe645hw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swe645hw3.model.StudentSurvey;
import com.example.swe645hw3.repository.StudentSurveyRepository;

@Service
public class StudentSurveyService {

	@Autowired
	private StudentSurveyRepository ssr;
	
	public StudentSurvey create(StudentSurvey survey) {
		return ssr.save(survey);
	}
	
	public List<StudentSurvey> read() {
		return ssr.findAll();
	}
	
	public StudentSurvey read(String id) {
		return ssr.findById(id).get();
	}
	
	public StudentSurvey update(StudentSurvey survey) {
		return ssr.save(survey);
	}
	
	public void delete(StudentSurvey survey) {
		ssr.delete(survey);
	}
}
