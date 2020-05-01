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
             System.out.println("failedpositive2");
             Assertions.assertNotEquals(ms.sayHello(), "failed");
     }
     @Test
     public void testMessage3() {
             System.out.println("dummy");
     }
     @Test
     public void testMessage4() {
     }
     @Test
     public void testMessage5() {
            Assertions.assertTrue(true);
     }
     @Test
     public void testMessage6() {
            Assertions.assertFalse(false);
     }
     @Test
     public void testMessage7() {
            Assertions.assertFalse(false);
     }
	
}
