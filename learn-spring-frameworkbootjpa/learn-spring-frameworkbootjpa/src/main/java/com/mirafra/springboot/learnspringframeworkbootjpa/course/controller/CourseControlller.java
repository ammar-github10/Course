package com.mirafra.springboot.learnspringframeworkbootjpa.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mirafra.springboot.learnspringframeworkbootjpa.courses.bean.Course;
import com.mirafra.springboot.learnspringframeworkbootjpa.courses.repository.CourseRepository;



@RestController
public class CourseControlller {
	
	@Autowired
	private CourseRepository repo;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses()
	{
		return repo.findAll();
	}
	
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable long id)
	{
		Optional<Course> course=repo.findById(id);
		if(course.isEmpty())
		{
			throw new RuntimeException("Course not found with id "+id);
		}
		return course.get();
	}
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course)
	{
		repo.save(course);
	}
	
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id,@RequestBody Course course)
	{
		repo.save(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id)
	{
		repo.deleteById(id);
	}

		
	
	

}
