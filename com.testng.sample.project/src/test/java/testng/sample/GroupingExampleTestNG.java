package testng.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class GroupingExampleTestNG {		
	static WebDriver driver;
    // Saving the expected title of the Webpage
    String title = "ToolsQA - Demo Website For Automation";
    
    public GroupingExampleTestNG() {
    	this.driver = new ChromeDriver();
    }

    @Test(groups = { "demo" })
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	//Initialize Chrome Driver
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    	 //driver = new ChromeDriver();
    	 driver.get("https://www.toolsqa.com/");
    }
    
    
    @Test(groups = { "demo" })	
    public void checkTitle() {	
       String testTitle = "Tools QA";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(groups = { "demo" })	
    public void click_element() {	
       driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).click();
        System.out.println("Home Page heading is displayed");	
    }
    
    @AfterTest
    public void tearDown() {
    	driver.close();
    }
}