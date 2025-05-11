package Framework.Steps;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenPolymerSteps {
	
	WebDriver driver;
	@Before
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
	
	@Given("^the user navigates to the todomvc site$")
	public void the_user_navigates_to_the_todomvc_site() throws Throwable {
		driver.get("https://todomvc.com/");
		Thread.sleep(2000);
	}

	@Given("^the user click on the JavaScript tab$")
	public void the_user_click_on_the_JavaScript_tab() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/paper-tab[1]/div")).click();
	}

	@Then("^the user verifies that the correct webpage with to-do list is opened$")
	public void the_user_verifies_that_the_correct_webpage_with_to_do_list_is_opened() throws Throwable {
		String url = "https://todomvc.com/examples/polymer/index.html";
	    if(driver.getCurrentUrl()==url)
	    {
			Assert.assertTrue(true);
		
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@When("^user clicks on the Polymer link$")
	public void user_clicks_on_the_Polymer_link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/iron-pages/div[1]/ul/li[8]/a")).click();
	}

	@Then("^the user verifies that the opened webpage has the headline todos$")
	public void the_user_verifies_that_the_opened_webpage_has_the_headline_todos() throws Throwable {
		Thread.sleep(2000);  
		if(driver.getPageSource().contains("todos"))
		    {
				Assert.assertTrue(true);
			
			}
			else {
				Assert.assertTrue(false);
			}
	}

	@When("^the user click on the Polymer link$")
	public void the_user_click_on_the_Polymer_link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body > div.container > div:nth-child(2) > div.col-md-8 > iron-pages > div:nth-child(1) > ul > li:nth-child(8) > a")).click();
	}

	@Then("^the user verifies that the opened webpage has the input for entering todo list$")
	public void the_user_verifies_that_the_opened_webpage_has_the_input_for_entering_todo_list() throws Throwable {
		Thread.sleep(2000);
		String atribut = "td-input";
	    if(driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).getAttribute("is")==atribut)
	    {
			Assert.assertTrue(true);
		
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@Then("^the user verifies that input has the label What needs to be done\\? in the back$")
	public void the_user_verifies_that_input_has_the_label_What_needs_to_be_done_in_the_back() throws Throwable {
		Thread.sleep(2000);
		String atribut = "What needs to be done?";
	    if(driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).getAttribute("placeholder")==atribut)
	    {
			Assert.assertTrue(true);
		
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
