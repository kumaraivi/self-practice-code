package test2;

import java.util.logging.Logger;

public class TestRunner {
	
	private static Logger logger=Logger.getLogger(TestRunner.class.getSimpleName());
	
	public static void main(String args[]) {
		
	int[] arr= {0,3,4,0,6,0,0,9};
	
	for(int a:sortBasedOnZero(arr)) {
	System.out.print(a+" ");
	}
}
	
	private static int[] sortBasedOnZero(int[] arr) {
    	int k=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]==0)
    		{
    			int temp=arr[i];
    			arr[i]=arr[k];
    			arr[k]=temp;
    			k++;
    		}
    	}
    	return arr;
}
}
