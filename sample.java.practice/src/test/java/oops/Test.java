package oops;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		 int[] arr={10,10,3,3,3,3,4,4,4,6};
	     List<Integer> list=new ArrayList<>();
	     
	    for(int i=0;i<arr.length;i++){
	        int counter=0;
	        if(!list.contains(arr[i])){
	        list.add(arr[i]);
	        counter++;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i]==arr[j]){
	                counter++;
	         }
	        }
	        System.out.println(arr[i]+" is present "+counter+" time");
	        }
	    }
		
		}

	}
