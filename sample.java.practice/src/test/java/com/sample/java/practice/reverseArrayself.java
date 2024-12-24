package com.sample.java.practice;

public class reverseArrayself {
	  public static void main(String args[]) {
	      
	      int[] arr={1,2,1,2,2,1,1};
	      reversedArray(arr);
	   
	  }
	  
	  public static void reversedArray(int[] arr){
		  int temp=0;
	      for(int i=0;i<arr.length;i++){
	          for(int j=i+1;j<arr.length;j++){
	              if(arr[i]>arr[j]){
	                  temp=arr[i];
	                  arr[i]=arr[j];
	                  arr[j]=temp;
	              }
	          }
	      }
	      for(int a:arr){
		    	System.out.print(a+" ");
		    }
	  }
	}