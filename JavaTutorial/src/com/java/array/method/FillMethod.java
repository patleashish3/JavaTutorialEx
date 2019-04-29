package com.java.array.method;

import java.util.Arrays;

public class FillMethod {
	public static void main(String[] args)
    {
        //An array of int
        int[] i = new int[5];
 
        Arrays.fill(i, 11);    //Assigns 11 to each element of the array
 
        System.out.println(Arrays.toString(i));   
 
        //An array of double
        double[] d = {23.12, 12.67, 54.76, 98.43};
 
        Arrays.fill(d, 55.5);    //Assigns 55.5 to each element of the array
 
        System.out.println(Arrays.toString(d));   
 
        //An array of boolean
        boolean[] bln = new boolean[5];
 
        Arrays.fill(bln, true);     //Assigns true to each element of the array
 
        System.out.println(Arrays.toString(bln));     
 
        //An array of char
        char[] c = new char[8];
 
        Arrays.fill(c, 'A');    //Assigns A to each element of the arrayS
        System.out.println(Arrays.toString(c));     
 
        //An array of String
        String[] str = {"Java", "Concepts", "basic java", "Arrays Class"};
 
        Arrays.fill(str, "value");    //Assigns value to each element of the array
 
        System.out.println(Arrays.toString(str));    
    }
}
