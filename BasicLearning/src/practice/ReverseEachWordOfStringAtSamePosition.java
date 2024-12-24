package practice;

public class ReverseEachWordOfStringAtSamePosition {

	public static void main(String[] args) {
		
		String str="Hello, My Name is Avinash";
		
		System.out.println(reverseEachWordOfStringAtSamePosition(str));

	}

	private static String reverseEachWordOfStringAtSamePosition(String str) {
		StringBuilder sb=new StringBuilder();
		String[] strArray=str.split(" ");
		
		for(int i=0;i<strArray.length;i++) {
			char[] cArray=strArray[i].toCharArray();
			for(int j=cArray.length-1;j>=0;j--) {
				sb.append(cArray[j]);
			}
			sb.append(" ");
		}
		return sb.toString();
	}

}
