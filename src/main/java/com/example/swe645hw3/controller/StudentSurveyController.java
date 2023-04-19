package com.example.swe645hw3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.swe645hw3.model.StudentSurvey;
import com.example.swe645hw3.service.StudentSurveyService;

@RestController
public class StudentSurveyController {
	
	@Autowired
	private StudentSurveyService sss;
	
	@PostMapping("/studentsurvey")
	public StudentSurvey addStudentSurvey(@RequestBody StudentSurvey survey) {
		return sss.create(survey);
	}
	
	@GetMapping("/studentsurvey")
	public List<StudentSurvey> getAllStudentSurveys() {
		return sss.read();
	}

	@GetMapping("/studentsurvey/{id}")
	public StudentSurvey findStudentSurveyById(@PathVariable("id") String id) {
		return sss.read(id);
	}
	
	@PutMapping("/studentsurvey")
	public StudentSurvey modifyStudentSurvey(@RequestBody StudentSurvey survey) {
		return sss.update(survey);
	}
	
	@DeleteMapping("/studentsurvey")
	public void deleteStudentSurvey(@RequestBody StudentSurvey survey) {
		sss.delete(survey);
	}
}
