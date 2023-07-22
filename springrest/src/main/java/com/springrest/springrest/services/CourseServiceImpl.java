package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		return this.courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return this.courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {		
		return this.courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {		
		return this.courseDao.save(course);
	}

	@Override
	public void deleteCourse(long courseId) {
		this.courseDao.delete(this.courseDao.findById(courseId).get());		
	}

}
