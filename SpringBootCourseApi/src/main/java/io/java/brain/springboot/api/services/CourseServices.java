package io.java.brain.springboot.api.services;

import io.java.brain.springboot.course.module.Course;
import io.java.brain.springboot.topic.module.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServices {
	@Autowired
	private CourseRepository courseRepository;
	private List<Topic> topicsList = new ArrayList<>(Arrays.asList(new Topic(1, "spring",
			"Spring Framework"), new Topic(2, "Java", "Java Framework"),
			new Topic(3, "Rest", "Rest Framework")

	));

	public List<Course> getCourseList(int id) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courses::add);
		
		return courses;
	}
	public Course getCourseListbyId(int id) {
		return courseRepository.findOne(id);
		//return topicsList.stream().filter(t->t.getId()==id).findFirst().get();
	}
	
	public void addCourse(Course course){
		courseRepository.save(course);
		//topicsList.add(topic);
		
	}
	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}
	public void deleteCourse(int id) {
		courseRepository.delete(id);
		//topicsList.removeIf(t->t.getId() == id);
	}
}
