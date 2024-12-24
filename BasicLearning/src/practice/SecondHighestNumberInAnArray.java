package practice;

public class SecondHighestNumberInAnArray {

	public static void main(String[] args) {
		int[] arr= {2,12,8,4,5,7,3};
		
		System.out.println(secondHighestNumberInAnArray(arr));

	}

	private static int secondHighestNumberInAnArray(int[] arr) {
		int highest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		for(int a:arr) {
			if(a>highest) {
				secondHighest=highest;
				highest=a;
			} else if(a>secondHighest) {
				secondHighest=a;
			}
		}
		return secondHighest;
	}

}
