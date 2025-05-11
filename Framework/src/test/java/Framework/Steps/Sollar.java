package Framework.Steps;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sollar {
	
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

	@Given("^the user opens Solargis site$")
	public void the_user_opens_Solargis_site() throws Throwable {
		driver.get("https://re.jrc.ec.europa.eu/pvg_tools/en/");
	}

	@Given("^the user enters two random coordinates$")
	public void the_user_enters_two_random_coordinates() throws Throwable {
		driver.findElement(By.id("inputLat")).sendKeys("45");
		driver.findElement(By.id("inputLon")).sendKeys("18");
	}

	@Given("^the user clicks Go$")
	public void the_user_clicks_Go() throws Throwable {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"btninputLatLon\"]")).sendKeys(Keys.RETURN);
		
	}

	@Given("^the user enters slope and azimuth$")
	public void the_user_enters_slope_and_azimuth() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#angle")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.cssSelector("#angle")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.cssSelector("#angle")).sendKeys("20");
	}

	@Given("^the user clicks calculate again$")
	public void the_user_clicks_calculate_again() throws Throwable {
		driver.findElement(By.id("btviewPVGridGraph")).click();
	}

	@Given("^the user now turns loop into entering data$")
	public void the_user_now_turns_loop_into_entering_data() throws Throwable {
		FileWriter myWriter = new FileWriter("filename.txt");
	    for(int i=-56; i<=75; i++)
	    	for(int j=-179; j<=179; j++)
	    	{
	    		driver.findElement(By.id("inputLat")).sendKeys(Keys.BACK_SPACE);
	    		driver.findElement(By.id("inputLat")).sendKeys(Keys.BACK_SPACE);
	    		driver.findElement(By.id("inputLat")).sendKeys(Keys.BACK_SPACE);
	    		driver.findElement(By.id("inputLat")).sendKeys(Keys.BACK_SPACE);
	    		driver.findElement(By.id("inputLon")).sendKeys(Keys.BACK_SPACE);
	    		driver.findElement(By.id("inputLon")).sendKeys(Keys.BACK_SPACE);
	    		driver.findElement(By.id("inputLon")).sendKeys(Keys.BACK_SPACE);
	    		driver.findElement(By.id("inputLon")).sendKeys(Keys.BACK_SPACE);
	    		driver.findElement(By.id("inputLat")).sendKeys(String.valueOf(i));
	    		driver.findElement(By.id("inputLon")).sendKeys(String.valueOf(j));
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//*[@id=\"btninputLatLon\"]")).sendKeys(Keys.RETURN);
	    		try {
	    			Thread.sleep(5000);
	    			driver.findElement(By.id("btviewPVGridGraph")).click();
	    			driver.findElement(By.id("tr_nodata"));
	    			myWriter.write(String.valueOf(i));
	    			myWriter.write(",");
	    			myWriter.write(String.valueOf(j));
	    			myWriter.write(",");
	    			myWriter.write(String.valueOf(0));
	    			myWriter.write("\n");
	    			}
	    		catch(Exception e){
	    			myWriter.write(String.valueOf(i));
	    			myWriter.write(",");
	    			myWriter.write(String.valueOf(j));
	    			myWriter.write(",");
	    			myWriter.write(String.valueOf(driver.findElement(By.id("PVGrid_irradiation")).getText()));
	    			myWriter.write("\n");
	    			Thread.sleep(5000);
	    			continue;
	    		}
	    		
	    	}
	    myWriter.close();
	}

	@Given("^the user clicks Go again$")
	public void the_user_clicks_Go_again() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the user clicks on the Calculate button$")
	public void the_user_clicks_on_the_Calculate_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the user verifies that the data is displayed$")
	public void the_user_verifies_that_the_data_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
