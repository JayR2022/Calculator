package com.jr.calculator.ui;

import com.jr.calculator.scan.scan;
import com.jr.calculator.operators.Operators;

public class ui {
	
	public void run() {
		String selectOperation = getOperations();
		Operators Operation = new Operators();
		getResults(selectOperation, Operation);
		
	}
	
	public String getOperations() {
		System.out.println("========================");
		System.out.println("Please select operators");
		System.out.println("========================");
		System.out.println("- (a) Add");
		System.out.println("- (s) Subtract");
		System.out.println("- (m) Multiply");
		System.out.println("- (d) Division");
		
		return scan.stringScan();
	}
	
	public void getResults(String selectOperation, Operators Operation) {
		switch(selectOperation) {
		case "a":
			System.out.println("Results: "+ Operation.add(scan.intScan(), scan.intScan()));
			break;
		case "s":
			System.out.println("Results: "+Operation.subtract(scan.intScan(), scan.intScan()));
			break;
		case "m":
			System.out.println("Results: "+Operation.multiply(scan.intScan(), scan.intScan()));
			break;
		case "d":
			System.out.println("Results: "+Operation.division(scan.intScan(), scan.intScan()));
			break;
		}
	}

}
