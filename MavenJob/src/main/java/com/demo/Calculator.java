package com.demo;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		System.out.println("Add:\t"+cal.add(3,3));
		System.out.println("SUB:\t"+cal.sub(5, 2));
	}

	public int mul(int i, int j) {
		
		return i*j;
	}
}
