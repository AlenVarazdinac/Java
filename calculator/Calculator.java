package calculator;

import java.util.Scanner;

public class Calculator {
	
	static public Scanner sc = new Scanner(System.in);
	static public float x;
	static public float y;
	static float result;
	
	public static void main(String[] args) {
		System.out.println("Select operation:\n1. +\n2. -\n3. *\n4. /\n");
		Operation();
	}
	
	public static void text() {
		System.out.println("Enter first number!");
		x = sc.nextFloat();
		System.out.println("Enter second number!");
		y = sc.nextFloat();
	}
	
	public static void Operation(){	
		int operation = sc.nextInt();
		
		if(operation==1) {
			text();
			result= x + y;
			System.out.println(x + " + " + y + " = " + result);
		}else if(operation==2) {
			text();
			result = x - y;
			System.out.println(x + " - " + y + " = " + result);
		}else if(operation==3) {
			text();
			result = x * y;
			System.out.println(x + " * " + y + " = " + result);
		}else if(operation==4) {
			text();
			result = x / y;
			System.out.println(x + " / " + y + " = " + result);
		}
			
	}
		
}
