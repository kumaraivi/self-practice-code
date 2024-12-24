package practice;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		System.out.print("Enter a Interger number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(isPrimeNumber(a));

	}

	private static boolean isPrimeNumber(int a) {
		
		if(a==0 || a==1) {
			return false;
		}
		if (a==2) {
			return true;
		}
		
		int m=a/2;
		
		for(int i=2;i<=m;i++) {
			if(a%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

}
