package com.sample.java.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringContainsVowels {

	public static void main(String[] args) {
		

//		System.out.println(stringContainsVowels("Hello"));
//		System.out.println(stringContainsVowels("TV"));
//		System.out.println(isPrimeNumber(1));
//		System.out.println(isPrimeNumber(2));
//		System.out.println(isPrimeNumber(0));
//		System.out.println(isPrimeNumber(3));
//		System.out.println(isPrimeNumber(10));
		
//		PrintFibonacci(10);
		
		System.out.println(checkPalindromeString("HhiH"));
		System.out.println(removeWhiteSpaces("Avinash123 123 @ Kumar"));
		int[] array = {1, 2, 3, -1, -2, 4};
		sortAnArray(array);
		System.out.println();
		System.out.println(factorial(0000000));
		System.out.println(factorial(01));
		System.out.println(factorial(5));

		reverseArrayList();

	}
	
	public static boolean stringContainsVowels(String str) {
		
		return str.toLowerCase().matches(".*[aeiou].*");
		
	}
	
	
	public static boolean isPrimeNumber(int num) {
		
		if(num==0 || num==1) {
			return false;
		}
		
		if(num==2) {
			return true;
		}
		
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void PrintFibonacci(int count) {
		 int a=5;
		 int b=5;
		 int c=a+b;
		 
		 for(int i=1;i<=count;i++) {
			 System.out.print(a+", ");
			 a=b;
			 b=c;
			 c=a+b;
		 }
		 
		 
	}
	
	public static boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();

		for (int i = 0; i < length/2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}

		return result;
	}
	
	public static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for (char c : charArray) {
			if (Character.isAlphabetic(c) || Character.isWhitespace(c) )
				output.append(c);
		}
		
		return output.toString();
	}
	
	
	public static void sortAnArray(int[] arr) {
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	
	public static long factorial(long n) {
		if (n == 1 || n==0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void reverseArrayList() {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);;
		
		System.out.println(list);
		
		LinkedList<Integer> list1=new LinkedList<>();
		
		list.descendingIterator().forEachRemaining(list1::add);
		
		System.out.println(list1);
	}

}
