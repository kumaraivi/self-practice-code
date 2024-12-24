package practice;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Hello Avinash";

		reverseString(str);

	}

	private static void reverseString(String str) {

		if (str == null) {
			throw new IllegalArgumentException("Null is not valid input");
		}
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());

	}

}
