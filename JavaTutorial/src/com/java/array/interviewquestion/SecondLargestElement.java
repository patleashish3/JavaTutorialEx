package com.java.array.interviewquestion;

import java.util.Arrays;

public class SecondLargestElement 
{
	public static void main(String[] args) 
	{
		int[] arr = {47498, 14526, 74562, 42681, 75283, 45796};
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--)
		{
			if(i==arr.length-2)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
