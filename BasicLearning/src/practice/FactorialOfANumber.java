package practice;

public class FactorialOfANumber {

	public static void main(String[] args) {
		long n=5;
		System.out.println(factorialOfNumber(n));

	}

	private static long factorialOfNumber(long n) {
		
		if(n==1 || n==0) {
			return 1;
		}
		else {
			return n*(factorialOfNumber(n-1));
			
		}
		
		
		
	}

}
