package com.example.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Course;
import com.example.repositories.CourseRepository;


@Service
public class CourseManagerImp implements CourseManager {

	@Autowired
	CourseRepository repository;
	
	@Override
	public void addCourse(Course c) {
		// TODO Auto-generated method stub
		repository.save(c);
	}

	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	
	@Override
	public void update(Course course, int id) {
		// TODO Auto-generated method stub
		repository.update(course.getCourse_name(),course.getCourse_description(),course.getCourse_duration(),course.getCourse_syllabus(),id);
	
	}
	
	
	

	@Override
	public Optional<Course> getCourse(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	
}
