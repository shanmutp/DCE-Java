package com.ripples.level0;

public class StaticClass {
	static{
		System.out.println("static block invoked*****");
	}
	int a ;
	static int b=0;
	
	 int add(int a, int b)
	{
		return a+b;
	}
	 static{
			System.out.println("static block invoked at the end*****");
		}
}
