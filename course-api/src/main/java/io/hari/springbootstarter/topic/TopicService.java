package io.hari.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	public List<Topic> topics = Arrays.asList(
		new Topic("spring", "Spring Framework", "Spring Frame Work  Description"),
		new Topic("java", "core java", "core java desciption"),
		new Topic("javascript", "javascript", "javascript  Description")
											);
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
			topics.add(topic);
	}
}
