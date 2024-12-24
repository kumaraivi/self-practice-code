package practice;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] arr= {23,34,12,32,5,14};
		
		for(int a:sortedArray(arr)) {
			System.out.print(a+" ");
		}
		System.out.println();

	}

	private static int[] sortedArray(int[] arr) {
		//Arrays.sort(arr);
		
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
		return arr;
		
		
	}

}
