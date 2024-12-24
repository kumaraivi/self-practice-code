package practice;

public class SumOfAllElementOfAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,10,20};
		
		System.out.println(sumOfAllElementOfArray(arr));

	}

	private static int sumOfAllElementOfArray(int[] arr) {
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		return sum;
	}

}
