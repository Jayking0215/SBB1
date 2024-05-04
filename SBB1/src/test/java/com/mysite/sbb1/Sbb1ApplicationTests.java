package com.mysite.sbb1;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sbb1ApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Test
	void testJpa() {
		Question q1 = new Question();
		q1.setSubject("What is SBB?");
		q1.setContent("I wanna know what is SBB");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
		
		Question q2 = new Question();
		q2.setSubject("Question: SpringBoot");
		q2.setContent("Is id create automatic?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
	}
}
