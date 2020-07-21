package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.MessageService;
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	MessageService ms = new MessageService();
	@Test
	public void testMessage() {
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	public void testdevops() {
		System.out.println("Welcome to Devops");
		Assertions.assertEquals(ms.sayDevops(), "devops");
	}
	public void testcontent() {
		System.out.println("Devops material");
		Assertions.assertEquals(ms.sayContent(), "content");
	}
	public void whenAssertingNotSameObject_thenDifferent() {
	    Object Agile = new Object();
	    Object Devops = new Object();
	    Assertions.assertNotSame(Agile, Devops);
	}
	public void whenAssertingConditions_thenVerified() {
	    Assertions.assertTrue(100 > 4, "100 is greater then 4");
	    Assertions.assertFalse(5 > 20, "5 is not greater then 20");
	}
}