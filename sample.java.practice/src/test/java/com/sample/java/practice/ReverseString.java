package com.sample.java.practice;

public class ReverseString {

	public static void main(String[] args) {
		
 String str="  Avinash Kumar  ";
		System.out.println(reverseStringOnPosition(str));
	}
	
	public static String reverseString(String str) {
		
		if(str==null) {
			throw new IllegalArgumentException("String should not be null");
		}
		
		StringBuilder sb=new StringBuilder();
		
		char[] charArray=str.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			sb.append(charArray[i]);
		}
		
		return sb.toString();
	}
	
public static String reverseStringOnPosition(String str) {
		
		if(str==null) {
			throw new IllegalArgumentException("String should not be null");
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(" ");
		
		String[] strArray=str.split(" ");
		
		for(int j=0;j<strArray.length;j++) {
		
			char[] charArray=strArray[j].toCharArray();
		    for(int i=charArray.length-1;i>=0;i--) {
			sb.append(charArray[i]);
			}
		    sb.append(" ");
		    
		}
		
		return sb.toString().trim();
	}





}
