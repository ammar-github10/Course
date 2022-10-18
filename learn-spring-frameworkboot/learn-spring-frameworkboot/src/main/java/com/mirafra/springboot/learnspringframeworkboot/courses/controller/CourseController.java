package com.mirafra.springboot.learnspringframeworkboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirafra.springboot.learnspringframeworkboot.courses.bean.Course;

@RestController
public class CourseController {
	//To get all courses
	@GetMapping("/courses")
	public List<Course> getAllCourses()
	{
		return Arrays.asList(new Course(1,"Java","Richard"),
				new Course(2,"PHP","Sam"));
	}
	
	//To get specific course
	@GetMapping("/courses/1")
	public Course getCourse()
	{
		return new Course(1,"Java","Richard");
	}

}
