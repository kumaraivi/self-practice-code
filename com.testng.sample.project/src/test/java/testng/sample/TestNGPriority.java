package testng.sample;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestNGPriority {
	@Test (priority = 1)
	public void b_method() {
		System.out.println("This is B method");
	}
		
	@Test (priority = 1)
	public void a_method() {
		System.out.println("This is A method");
	}
		
	@Test
	public void d_method() {
		System.out.println("This is D Method");
	}
		
	@Test
	public void c_method() {
		System.out.println("This is C Method");
	}
	
	@Parameters({ "suite-param" })
	@Test
	   public void prameterTestOne(String param) {
	   System.out.println("Test one suite param is: " + param);
	}
}