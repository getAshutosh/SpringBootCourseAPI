package io.java.brain.springboot.api.services;

import io.java.brain.springboot.topic.module.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServices {
	@Autowired
	private TopicRepository topicRepository;
	private List<Topic> topicsList = new ArrayList<>(Arrays.asList(new Topic(1, "spring",
			"Spring Framework"), new Topic(2, "Java", "Java Framework"),
			new Topic(3, "Rest", "Rest Framework")

	));

	public List<Topic> getTopicList() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	public Topic getTopicListbyId(int id) {
		return topicRepository.findOne(id);
		//return topicsList.stream().filter(t->t.getId()==id).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topicRepository.save(topic);
		//topicsList.add(topic);
		
	}
	public void updateTopic(int id,Topic topic) {
		topicRepository.save(topic);
		
	}
	public void deleteTopic(int id) {
		topicRepository.delete(id);
		//topicsList.removeIf(t->t.getId() == id);
	}
}
