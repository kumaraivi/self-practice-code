package practice26Sept2024;

import java.util.ArrayList;
import java.util.List;

public class PracticeClass {

	public static void main(String[] args) {
		String name="Avinash";
		
		System.out.println(name.length());
		
		StringBuilder str=new StringBuilder();
		
		char[] strArray=name.toCharArray();
		
		for(int i=strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]);
			str.append(strArray[i]);
		}
		System.out.println("\t");
		System.out.println(str.toString());
		 int n=50;
		int minpoint =0;
		
		for(int j=1;j<=n;j++) {
			boolean flag=true;
			minpoint=j/2;
			for(int k=2;k<=minpoint;k++) {
				if(j%k==0) {
					flag=false;
				}
			}
			if(flag==true && j!=1) {
				System.out.println(j);
			}
		}
		
		int a=10;
		int b=20;
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println("after swipe a is "+a+" b is "+b);
		
		String str1="vsh";
		
		System.out.println(str1.toLowerCase().matches(".*['aeiou'].*"));
		
		
		int x=0, y=1, z=1;
		int count=10;
		for(int i=1;i<=count;i++) {
			if(i==10) {
				System.out.print(x);	
			} else {
			System.out.print(x+", ");
			}
			x=y;
			y=z;
			z=x+y;
			
		}
		
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(5);
		for(int a1:list) {
			if(a1%2!=0) {
				System.out.println("List contains odd number");
				break;
			}
		}
		
		
		System.out.println(StringPallindromeCheck("AHAA"));
		System.out.println(removeSpcaeFromString("Avinash Kumar Honey"));
		
		int[] arr1= {6,3,5,2};
		arr1=SortArray(arr1);
		for(int a2:arr1) {
			System.out.print(a2+" ");
		}
		System.out.println("\t");
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(5));
		System.out.println(factorial(10));

	}
	
	
	public static boolean StringPallindromeCheck(String str) {
		int length=str.length();
		
		for(int i=0;i<length;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static String removeSpcaeFromString(String str) {
		StringBuilder sb=new StringBuilder();
		char[] charArray=str.toCharArray();
		
		for(char c:charArray) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public static int[] SortArray(int[] arr) {
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
	
	public static int factorial(int n) {
		if(n>=0 && n<=1) {
			return 1;
		}
		int fact=(n*factorial(n-1));
		
		return fact;
	}

}
