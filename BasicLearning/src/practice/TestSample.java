package practice;

public class TestSample {

	public static void main(String[] args) {
		
try {
	for(int a=0;a<=-10;a++) {
	if(a<10) {
		System.out.println("I am in first block: "+a);
	}
	if(a>10) {
		System.out.println("I am in second block: "+a);
	}
	if(a<=10) {
		System.out.println("I am in third block: "+a);
	}
	if(a==10) {
		System.out.println("I am in fourth block: "+a);
	}
	if(a>=10) {
		System.out.println("I am in fifth block: "+a);
	}
} 
}catch (Exception e) {
	System.out.println("Catch block");
}

String s1 = "abc";
String s2 = new String("abc");

System.out.println("s1 == s2 is:" +(s1==s2)+ " "+s1.equals(s2));

	}

}
