package com.jr.calculator.main;

import com.jr.calculator.ui.ui;
import com.jr.calculator.scan.scan;
public class Calculator {
	
	public static void main(String[] args) {
		ui calcUi = new ui();
		calcUi.run();
		scan.closeScan();
		}
}
			
