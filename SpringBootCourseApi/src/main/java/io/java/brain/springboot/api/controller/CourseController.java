package io.java.brain.springboot.api.controller;

import io.java.brain.springboot.api.services.CourseServices;
import io.java.brain.springboot.course.module.Course;
import io.java.brain.springboot.topic.module.Topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CourseController {
	@Autowired
	private CourseServices courseServices;
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCource(@PathVariable("topicId") int topicId){
		return courseServices.getCourseList(topicId);
	}
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable("id") int id){
		
		return courseServices.getCourseListbyId(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourse(@PathVariable("topicId") int topicId,@RequestBody Course course){
		course.setTopic(new Topic(topicId, "", ""));
		courseServices.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses")
	public void updateTopic(@RequestBody Course course, @PathVariable("topicId") int topicId){
		course.setTopic(new Topic(topicId, "", ""));
		courseServices.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}/courses/{id}")
	public void deleteCourse(@PathVariable int id){
		courseServices.deleteCourse(id);
	}
}
