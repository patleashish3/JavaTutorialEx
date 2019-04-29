package com.java.array.method;

import java.util.Arrays;

public class BinarySearchMethod {
	  public static void main(String[] args)
	    {
	        //An array of int
	        int[] i = {34, 14, 41, 65, 86, 17, 22};
	 
	        //Sorting the int array
	        Arrays.sort(i);
	 
	        //Printing sorted array
	        System.out.println(Arrays.toString(i));       
	 
	        //Searching the value
	        System.out.println(Arrays.binarySearch(i, 14));  
	 
	        System.out.println(Arrays.binarySearch(i, 65));  
	 
	        System.out.println(Arrays.binarySearch(i, 17));  
	        
	        System.out.println(Arrays.binarySearch(i, 0, 5, 41));
	 
	        //An array of char
	        char[] c = {'A', 'A', 'H', 's', 'R', 'J', 'K', 'F'};
	 
	        //Sorting the char array
	        Arrays.sort(c);
	 
	        //Printing Sorted array
	        System.out.println(Arrays.toString(c));      
	 
	        //Searching the character
	        System.out.println(Arrays.binarySearch(c, 'A'));     
	 
	        System.out.println(Arrays.binarySearch(c, 'H'));     
	 
	        System.out.println(Arrays.binarySearch(c, 'K'));   
	 
	        //An array of String
	        String[] str = {"First", "second", "Third", "second", "Four", "fifth"};
	 
	        //Sorting the String array
	        Arrays.sort(str);
	 
	        //Printing Sorted array
	        System.out.println(Arrays.toString(str));     
	 
	        //Searching the string in the array
	        System.out.println(Arrays.binarySearch(str, "Third"));    
	 
	        System.out.println(Arrays.binarySearch(str, "second"));   
	 
	        System.out.println(Arrays.binarySearch(str, "sixth"));   
	    }
	}

