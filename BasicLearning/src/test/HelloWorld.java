package test;


public class HelloWorld {
	
	
	final int calculate(int... values) {
		int sum=0;
		for(int a:values) {
			sum+=a;
		}
		return sum;
	}

}
