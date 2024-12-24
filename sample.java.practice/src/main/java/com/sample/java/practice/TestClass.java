package com.sample.java.practice;


public class TestClass 
{
    public static void main( String[] args ) {
       
    	String str=new String("Hello");
    	
    	String str1="Hello";
    	String str2="Hello";
    	
    	System.out.println(str.equals(str1));
    	System.out.println(str==str1);
    	System.out.println(str2==str1);
    	System.out.println(str1.equals(str2));
    }
}
