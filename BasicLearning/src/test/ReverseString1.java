package test;

public class ReverseString1 {

	public static void main(String[] args) {
		String str="Hello Avinash Kumar";
		
		StringBuilder sbuild=new StringBuilder();
		sbuild.append(str);
		System.out.println(sbuild);
		System.out.println(sbuild.reverse());
		
		String[] strArr=str.split(" ");
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<strArr.length;i++) {
			
			char[] cArr=strArr[i].toCharArray();
			for(int j=cArr.length-1;j>=0;j--) {
				sb.append(cArr[j]);
			}
			sb.append(" ");
		}
		
		System.out.println(sb);

	}

}
