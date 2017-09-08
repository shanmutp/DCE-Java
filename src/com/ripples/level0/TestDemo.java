package com.ripples.level0;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter the String...");
		  String s = in.next();
			long startTime= System.currentTimeMillis();
		  char[] c = s.toCharArray();
		  
		  int[] check = new int[s.length()];
		  for (int i = 0; i < s.length(); i++) {
		   check[i] = 0;
		  }
		  for (int i = 0; i < s.length() - 1; i++) {
		   for (int j = s.length()/2; j < s.length(); j++) {
		    if (c[i] == c[j] && check[i] == 0 && check[j] == 0)// check ith
		                 // and jth
		                 // term of
		                 // array
		                 // variable
		                 // is 0
		    {
		     // store 1 in it array variable both ith and jth term
		     check[i] = 1;
		     check[j] = 1;
		     break;
		    }
		   }
		  }
		  int count = 0;
		  for (int i = 0; i < s.length(); i++) {
		   if (check[i] == 1) {
		    count++;
		   }
		  }
		  if (count == s.length() - 1 || count == s.length()) {
		   System.out.println("It can be Palindrome");
		  } else {
		   System.out.println("It can not  be Palindrome");
		  }

		  long endTime= System.currentTimeMillis();
			System.out.println("Time taken-->"+(endTime-startTime));	 
	}
}
