package Framework.Steps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Two {
	
	String labell = "new-todo";
	WebDriver driver;
	@Before()
	public void setup() throws IOException {
		//Chrome driver needs direct path to it, so the commented function below does not work but user needs to change the path on his/hers working machine
		//System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath()+"src\\test\\java\\Framework\\other\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\sheci\\OneDrive\\Desktop\\Framework\\Framework\\src\\test\\java\\Framework\\other\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	
	@After()
	public void tearDown()
	{
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
	}
	
	@Given("^the user is on the to do mvc site$")
	public void the_user_is_on_the_to_do_mvc_site() throws Throwable {
		driver.get("https://todomvc.com/");
		driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/paper-tab[1]/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/iron-pages/div[1]/ul/li[8]/a")).click();
	}

	@Given("^the user enters two inputs$")
	public void the_user_enters_two_inputs() throws Throwable {
		for(int i=0; i<2; i++) {
		Thread.sleep(2000);
		driver.findElement(By.id(labell)).sendKeys("go to the mall");
		Thread.sleep(2000);
		driver.findElement(By.id(labell)).sendKeys(Keys.RETURN);
		   
		}
	}

	@Then("^the user verifies that those two inputs are present$")
	public void the_user_verifies_that_those_two_inputs_are_present() throws Throwable {
	    if (driver.findElements(By.className("toogle")).isEmpty( ) == false)
	    {
	    	assertEquals(true, false);
	    }
	    else
	    {
	    	Assert.assertEquals(true, true);
	    }
	}

}
