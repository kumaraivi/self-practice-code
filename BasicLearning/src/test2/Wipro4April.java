package test2;

public class Wipro4April {

	public static void main(String[] args) {
		String str="avInash kumAr";
         str=str.toLowerCase();
		char[] cArr=str.toCharArray();
		for(int i=0;i<cArr.length;i++){
		if(cArr[i]=='a'){
		} else if (cArr[i]=='e'){
		}else if (cArr[i]=='i'){
		}else if (cArr[i]=='o'){
		}else if (cArr[i]=='u'){
		} else {
		System.out.print(cArr[i]);
		}


		}
		
		System.out.println();
		
		int[] arr={56,23,98,87,46};

		int temp=0;
		for(int i=0; i<arr.length;i++){

		for(int j=i+1; j<arr.length;j++){

		if(arr[i]>arr[j]){
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		}

		System.out.println(arr[arr.length-2]);
		
		String[] str1={"avinash","avinashkumar","kumar"};

				
				String temp1;
				for(int i=0;i<str1.length;i++){
				for(int j=i+1;j<str1.length;j++){
				if(str1[i].length()>str1[j].length()) {
					temp1=str1[i];
					str1[i]=str1[j];
					str1[j]=temp1;
				}
			}
	    }
				for(String a:str1) {
					System.out.print(a.toString()+" ");
				}

	}
}
