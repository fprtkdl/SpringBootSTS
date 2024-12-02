package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

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
///////////////////////////////////////////////////////////////////////////		
//		
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//        q1.setContent("sbb에 대해서 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);  // 첫번째 질문 저장
//        Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);  // 두번째 질문 저장
//		
///////////////////////////////////////////////////////////////////////////	
//		
//        List<Question> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());
//        Question q = all.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());
//		
///////////////////////////////////////////////////////////////////////////	
//		
//		Optional<Question> oq = this.questionRepository.findById(1);
//        if(oq.isPresent()) {
//            Question q = oq.get();
//            assertEquals("sbb가 무엇인가요?", q.getSubject());
//        }
//		
///////////////////////////////////////////////////////////////////////////
        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
        assertEquals(1, q.getId());
///////////////////////////////////////////////////////////////////////////
	}
}