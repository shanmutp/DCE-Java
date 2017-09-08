package com.ripples.level0;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s = "a10b10c5";
        Character samplechar=null;
        int sampleint=0;
        char[] stringArray;
        stringArray = s.toCharArray(); 
        for(int i=0;i<stringArray.length;i++)
        {
            if(Character.isLetter(stringArray[i]))
            {
                if(sampleint==0)
                {
                    samplechar=stringArray[i];    
                }
                else
                {
                    for(int k=0;k<sampleint;k++)
                    {
                        System.out.print(samplechar);
                    }
                    i--;
                    sampleint=0;
                }
                
            }
            else if(Character.isDigit(stringArray[i]))
            {
                sampleint=(sampleint*10)+Character.getNumericValue(stringArray[i]);
            }
            
        }
    }



}
