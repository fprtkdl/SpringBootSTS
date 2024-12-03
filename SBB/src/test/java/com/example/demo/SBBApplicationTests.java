package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.mysite.sbb.Question;
import com.mysite.sbb.QuestionRepository;
import com.mysite.sbb.SBBApplication;

@SpringBootTest
@ContextConfiguration(classes = SBBApplication.class)
class SBBApplicationTests
 {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Test
	void testJpa() {

		 List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
	     Question q = qList.get(0);
	     assertEquals("sbb가 무엇인가요?", q.getSubject());
		
	}
}