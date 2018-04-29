package io.java.brain.springboot.api.services;

import java.util.List;

import io.java.brain.springboot.course.module.Course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
	public List<Course> findByTopicId(int id);

}
