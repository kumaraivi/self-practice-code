package practice;

public class MergeTwoArraySorted {

	public static void main(String[] args) {
		 int[] arr1= {10,23,5,9,12};
		 int[] arr2= {10,3,5,10,8,10};
		 int[] mergedArray=mergeTwoArraySorted(arr1, arr2);
		 for(int a:mergedArray) {
			 System.out.print(a+" ");
		 }

	}

	private static int[] mergeTwoArraySorted(int[] one, int[] two) {
		int[] sorted=new int[one.length+two.length];
//		int i = 0;
//		int j = 0;
//		int k = 0;

//		while (i < one.length && j < two.length) {
//			if (one[i] < two[j]) {
//				sorted[k] = one[i];
//				k++;
//				i++;
//			} else {
//				sorted[k] = two[j];
//				k++;
//				j++;
//			}
//		}
//
//		if (i == one.length) {
//			while (j < two.length) {
//				sorted[k] = two[j];
//				k++;
//				j++;
//			}
//		}
//
//		if (j == two.length) {
//			while (i < one.length) {
//				sorted[k] = one[i];
//				k++;
//				i++;
//			}
//		}
		for(int i=0;i<one.length;i++) {
			sorted[i]=one[i];
		}
		
		for(int j=0;j<two.length;j++) {
			sorted[j+one.length]=two[j];
		}
		int temp=0;
		for(int i=0;i<sorted.length;i++) {
			for(int j=i+1;j<sorted.length;j++) {
				if(sorted[i] > sorted[j]) {
					temp=sorted[i];
					sorted[i]=sorted[j];
					sorted[j]=temp;
				}
			}
		}

		return sorted;
	}

}
