package com.springrest.springrest.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiseImpl implements CourseService{
	
	
	List<Course>list;
	
	public CourseServiseImpl() {
	 
		list=new ArrayList<>();
		list.add(new Course(121,"java core","This Course contains of java") );
		list.add(new Course(122,"Spring boot","This Course contains of spring boot") );
		
	}

	@Override
	public List<Course> getcourses() {
		// TODO Auto-generated method stub
		return list;
	}

	
	@Override
	public Course getcourse(long courseId) {
		
		Course c= null;
		for (Course course:list)
		{
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}	

}
