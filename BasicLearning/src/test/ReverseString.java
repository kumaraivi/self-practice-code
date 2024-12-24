package test;

public class ReverseString {

	public static void main(String[] args) {
		
reverseString("Hello! I am Avinash Kumar");

	}
	
	public static void reverseString(String text) {
		
		char[] charArray=text.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}

}
