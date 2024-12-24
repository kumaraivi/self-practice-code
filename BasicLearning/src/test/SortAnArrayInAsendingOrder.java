package test;

public class SortAnArrayInAsendingOrder {

	public static void main(String[] args) {
		

		int[] arr= {12,5,23,11,8};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			
	}
		for(int a:arr) {
			System.out.print(a+" ");
		}


}
}
