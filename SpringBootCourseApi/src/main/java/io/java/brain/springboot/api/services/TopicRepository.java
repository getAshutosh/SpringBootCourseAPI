package io.java.brain.springboot.api.services;

import io.java.brain.springboot.topic.module.Topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
	//getAllTopic
	//getTopic(int id)
	//updateTopic(Topic topic)
	//deleteTopic(int id)

}
