package com.sample.java.practice;

import java.io.File;

public class ExceptionHandling {
	
	
	public static void main(String args[])  {
		try {
			int[] myNumbers = {1, 2, 3};
		    System.out.println(myNumbers[10]);
			int b=myNumbers[1]/0;			
		}catch (Exception e) {
			System.out.println(e);
		}
		double c=12/2.8;
		System.out.println(c);
		
	}

}