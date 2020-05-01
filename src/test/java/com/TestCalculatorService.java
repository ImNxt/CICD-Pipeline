package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {

	int num1=20;
	int num2=10;
	CalculatorService calSer=new CalculatorService();
	
	@Test
	public void testSum() {
		Assertions.assertEquals(30, calSer.calculateSum(num1, num2));
	}
	
	@Test
	public void testDiff() {
		Assertions.assertEquals(10, calSer.calculateDiff(num1, num2));

	}
	
	@Test
	public void testMultiply() {
		Assertions.assertEquals(300, calSer.calculateMultiply(num1, num2));

	}
	@Test
	public void testDivide() {
		Assertions.assertEquals(2,calSer.calculateDivide(num1, num2));
	}
	
	@Test
	public void testRemainder() {
		Assertions.assertEquals(0,calSer.calculateRemainder(num1, num2));
	}
	
	@Test
	public void testPercentage() {
		Assertions.assertEquals(20,calSer.calculatePercentage(num1, num2));
	}
	
	@Test
	public void testAverage() {
		Assertions.assertEquals(22.5,calSer.calculateAverage(num1, num2));
	}
	
}
