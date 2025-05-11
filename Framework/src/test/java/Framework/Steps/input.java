
package Framework.Steps;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.nio.file.Paths;
import java.nio.file.Path;


public class input {
	
	WebDriver driver;
	@Before()
	public void setup() throws IOException {
		String chromeDriverPath = Paths.get(System.getProperty("user.dir"), "src", "test", "java", "Framework", "other", "chromedriver.exe").toString();
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		//Chrome driver needs direct path to it, so the commented function below does not work but user needs to change the path on his/hers working machine
		//System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath()+"src\\test\\java\\Framework\\other\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",
	            //"C:\\Users\\sheci\\OneDrive\\Desktop\\Framework\\Framework\\src\\test\\java\\Framework\\other\\chromedriver.exe");
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
	
	@Given("^the user opens Navigator site$")
	public void the_user_opens_Navigator_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.navigator.ba/#/categories");
		Thread.sleep(5000);
		
	}

	@When("^the user clicks on the input field and writes Vijećnica$")
	public void the_user_clicks_on_the_input_field_and_writes_Vijećnica() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	    driver.findElement(By.id("ember564")).click();
	    driver.findElement(By.cssSelector("#ember558")).sendKeys("Vijećnica");

			   
	}

	@When("^the user presses the RETURN key$")
	public void the_user_presses_the_RETURN_key() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ember558")).sendKeys(Keys.RETURN);
	}

	@Then("^the user verifies that the city hall of Sarajevo is shown as the search result on the screen")
	public void the_user_verifies_that_the_city_hall_of_Sarajevo_is_shown_as_the_search_result_on_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		    Thread.sleep(3000);
	    	WebElement vijecnica = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[1]/div/div[1]/ul/li[1]/a/div/div[1]/div[1]"));
	    	String resultText = vijecnica.getAttribute("title");
	    	String expectedtitle = "Gradska vijećnica";
	    	Assert.assertEquals(expectedtitle, resultText);
	    
	}

}
