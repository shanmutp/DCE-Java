package com.ripples.level0;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test1 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter the row...");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        char[][] c = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    c[i][j]='X';
                    
                }
                else
                {
                    c[i][j]=' ';
                }
                if(i+j == n-1)
                {
                    c[i][j]='X';
                }
                
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
             System.out.print(c[i][j]);    
            }
            System.out.println(" ");
        }

    }



}
