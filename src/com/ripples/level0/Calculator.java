package com.ripples.level0;

public class Calculator {
	
	private int result;
	int abc;
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Result CAlc->"+c);

	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);

	}

	public int add(long a, int b, int c) {
		int d = (int)a + b + c;
		System.out.println(d);
		return d;

	}
	  public void add(float a, float b) {
		float c = a + b;
		System.out.println(c);

	}
	 

}
