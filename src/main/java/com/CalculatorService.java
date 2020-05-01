package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

	int number1=25;
	int number2=20;
	@GetMapping("/Sum")
	public int calculateSum(int number1, int number2) {
		return number1+ number2;
		
	}
	
	@GetMapping("/Diff")
	public int calculateDiff(int number1, int number2) {
		return  number1 - number2;
		
	}
	
	@GetMapping("/Multiply")
	public int calculateMultiply(int number1, int number2) {
		return number1 * number2;
		
	}
	
	@GetMapping("/Divide")
	public double calculateDivide(int number1,int number2) {
		return number1/number2;
		
	}
	
	@GetMapping("/Remainder")
	public int calculateRemainder(int number1,int number2) {
		return number1 % number2;
		
	}
	
	@GetMapping("/Percentage")
	public double calculatePercentage(int number1,int number2) {
		return (number1 / number2)*100;
		
	}
	
	@GetMapping("/Average")
	public double calculateAverage(int number1,int number2) {
		return (number1 + number2)/2;
		
	}
	
}
