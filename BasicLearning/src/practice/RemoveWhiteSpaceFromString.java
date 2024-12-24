package practice;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String str="   Hello Avinash   ";
		System.out.println(str.trim());
		System.out.println(removeWhiteSpace(str));

	}

	private static String removeWhiteSpace(String str) {
		
		char[] c=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<c.length;i++) {
			if(!Character.isWhitespace(c[i])) {
				sb.append(c[i]);
			}
		}
		return sb.toString();
		// TODO Auto-generated method stub
		
	}

}
