package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest

public class TestMessageService {

	MessageService ms =new MessageService();
	
	@Test
	public void testMessage1() {
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	 @Test
     public void testMessage2() {
             Assertions.assertNotEquals(ms.sayHello(), "failed");
     }
     @Test
     public void testMessage3() {
     }
     @Test
     public void testMessage4() {
            Assertions.assertTrue(true);
     }
     @Test
     public void testMessage5() {
            Assertions.assertFalse(false);
     }
	
}
