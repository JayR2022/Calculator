package com.jr.calculator.operators;

import java.lang.Math;

public class Operators {
	
	public Operators() {
		// default constructors
	}
	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1*num2;
	}
	
	public double subtract(double num1, double num2) {
		return num1-num2;
	}
	
	public double division(double dividend, double divisor) {
		if (divisor<dividend) {
			return dividend/divisor;
		}
		else {
			System.out.println("Division cannot be performed");
			return 0;
		}
	}

}
