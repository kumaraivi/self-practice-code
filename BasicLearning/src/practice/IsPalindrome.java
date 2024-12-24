package practice;

public class IsPalindrome {

	public static void main(String[] args) {
		String str1="aHa";
		String str2="Hello";
		
		System.out.println(isPalindrome(str1));
		System.out.println(isPalindrome(str2));
	}

	private static boolean isPalindrome(String str) {
		boolean result=true;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				result = false;
				break;
			}
		}
		return result;
	}

}
