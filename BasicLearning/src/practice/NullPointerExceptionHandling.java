package practice;

public class NullPointerExceptionHandling {

	public static void main(String[] args) {
		String str=null;
		checkNullPointerException(str, 5);

	}

	private static void checkNullPointerException(String str, int count) {
        if(str==null) {
        	System.out.println("Provided sting is null");
        	return;
        }
        
        
try {
        for (int i = 0; i < count; i++) {
    		System.out.println(str.toUpperCase());
    	}
} catch (Exception e) {
	System.out.println(e.getMessage());
}

	}



}
