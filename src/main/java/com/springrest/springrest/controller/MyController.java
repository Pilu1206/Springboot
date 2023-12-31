package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return " Welcome to Courses Application ";
	}
	
	// get the all Courses 
	
	@GetMapping("courses")
	public List<Course> getcourses(){
		
		return this.courseService.getcourses();
	
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.courseService.getcourse(Long.parseLong(courseId));
	}

}
