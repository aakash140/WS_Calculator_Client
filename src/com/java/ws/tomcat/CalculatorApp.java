package com.java.ws.tomcat;

public class CalculatorApp {

	public static void main(String[] args) {
		CalculatorService calculatorService=new CalculatorService();
		CalculatorIfc calculatorIfc=calculatorService.getCalculatorPort();
		System.out.println("Result of 3 * 2 is: "+ calculatorIfc.multiply(3, 2));
	}
}