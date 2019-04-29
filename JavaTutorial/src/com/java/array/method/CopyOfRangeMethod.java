package com.java.array.method;

import java.util.Arrays;

public class CopyOfRangeMethod {
	 public static void main(String[] args)
	    {
	        //An array of int
	        int [] i= {1,3,5,7,9,4,10};
	 
	        //Copying array i into array i1
	       int [] i1= Arrays.copyOfRange(i, 3, 6);
	       
	       System.out.println(Arrays.toString(i1));
	 
	        //An array of double
	        double[] d = {11.5, 45.8, 52.2, 32.9, 44.6, 87.5};
	 
	        //Copying array d into array d1
	        double[] d1 = Arrays.copyOfRange(d, 1, 5);
	 
	        System.out.println(Arrays.toString(d1));    
	 
	        //An array of boolean
	        boolean[] bln = {true, false, true, true, false};
	 
	        //Copying array bln into array bln1
	        boolean[] bln1 = Arrays.copyOfRange(bln, 2, 7);
	 
	        System.out.println(Arrays.toString(bln1));  
	 
	        //An array of char
	        char[] c = {'X', 'B', 'Z', 'H', 'I', 'J'};
	 
	        //Copying array c into array c1
	        char[] c1 = Arrays.copyOfRange(c, 2, 10);
	 
	        System.out.println(Arrays.toString(c1));    
	 
	        //An array of String
	        String[] str = {"java", "j2ee", "struts", "hibernate"};
	 
	        //Copying array str into array str1
	        String[] str1 = Arrays.copyOfRange(str, 2, 9);
	        System.out.println(Arrays.toString(str1));
	    }
}
