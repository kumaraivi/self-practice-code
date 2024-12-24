package practice;

public class WhyStringImmutable {

	public static void main(String[] args) {
		String s1 = "Java"; // "Java" String created in pool and reference assigned to s1

		String s2 = s1; //s2 also has the same reference to "Java" in the pool

		System.out.println(s1 == s2); // proof that s1 and s2 have the same reference

		s1 = "Python"; 
		//s1 value got changed above, so how String is immutable?

		//in the above case a new String "Python" got created in the pool
		//s1 is now referring to the new String in the pool 
		//BUT, the original String "Java" is still unchanged and remains in the pool
		//s2 is still referring to the original String "Java" in the pool

		// proof that s1 and s2 have different reference
		System.out.println(s1 == s2); 

		System.out.println(s2); 
		// prints "Java" supporting the fact that original String value is unchanged, hence String is immutable
		
		 String st1 = "Scaler";
		    String st2 = "scaler";
		    // comparing st1 with st2
		    System.out.println("Comparing st1 and st2: " + (st1.equals(st2)));
		    System.out.println(st1==st2);
		    String st3 = "Topics";
		    String st4 = "ScalerTopics";
		    String st5 = st1 + st3; // st5 = "ScalerTopics"

		    // comparing st4 with st5
		    System.out.println("Comparing st4 and st5: " + (st4.equals(st5)));
		    System.out.println(st4==st5);
		    System.out.println(st4.equals(st5));
		

	}

}
