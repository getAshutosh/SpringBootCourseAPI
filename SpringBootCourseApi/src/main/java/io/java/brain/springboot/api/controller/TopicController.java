package io.java.brain.springboot.api.controller;

import io.java.brain.springboot.api.services.TopicServices;
import io.java.brain.springboot.topic.module.Topic;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicServices topicServices;
	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return topicServices.getTopicList();
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") int idFind){
		return topicServices.getTopicListbyId(idFind);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic){
		 topicServices.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable int id){
		 topicServices.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable int id){
		 topicServices.deleteTopic(id);
	}
}
