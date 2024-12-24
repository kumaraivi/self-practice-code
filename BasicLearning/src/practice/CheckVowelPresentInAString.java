package practice;

public class CheckVowelPresentInAString {

	public static void main(String[] args) {
		
		String str="Avinash";
		System.out.println(str.toLowerCase().matches(".*[aeiou].*"));

	}

}
