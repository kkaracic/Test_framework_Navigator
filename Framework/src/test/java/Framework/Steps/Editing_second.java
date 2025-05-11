package Framework.Steps;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Editing_second {
	
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
	
	@Given("^the user opens Polymer site$")
	public void the_user_opens_Polymer_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://todomvc.com/");
		driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/paper-tab[1]/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/iron-pages/div[1]/ul/li[8]/a")).click();
	}

	@Given("^the user enters two tasks$")
	public void the_user_enters_two_tasks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 for(int i=0; i<2; i++) {
			   Thread.sleep(2000);
			   driver.findElement(By.id(labell)).sendKeys("go to the mall");
			   Thread.sleep(2000);
			   driver.findElement(By.id(labell)).sendKeys(Keys.RETURN);
			   
		   }
	}

	@When("^the user does \"([^\"]*)\" on the second item$")
	public void the_user_does_on_the_second_item(DataTable table) throws Throwable {
	    List<List<String>> data = table.raw();
		System.out.print("Argument je");
		System.out.print(data.get(0).get(0));
	}

	@Then("^the user verifies that the second item is \"([^\"]*)\"$")
	public void the_user_verifies_that_the_second_item_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
