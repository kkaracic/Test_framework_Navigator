package Framework.Steps;

import static org.testng.Assert.assertTrue;

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
import org.junit.Assert;


public class Making_Two_Steps {
	
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
	
	@Given("^the user opens the todomvc site$")
	public void the_user_opens_the_todomvc_site() throws Throwable {
		driver.get("https://todomvc.com/");
	}

	@Given("^the user clicks on the JavaScript tab$")
	public void the_user_clicks_on_the_JavaScript_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/paper-tab[1]/div")).click();
	}

	@Given("^the user clicks on the Polymer link$")
	public void the_user_clicks_on_the_Polymer_link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/iron-pages/div[1]/ul/li[8]/a")).click();
	}

	@When("^the user enters some text in the to-do label$")
	public void the_user_enters_some_text_in_the_to_do_label() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys("go to the mall");
	}

	@When("^the user presses Enter on keyboard$")
	public void the_user_presses_Enter_on_keyboard() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys(Keys.RETURN);
	}

	@When("^the user enters some text again in the to-do label$")
	public void the_user_enters_some_text_again_in_the_to_do_label() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys("buy some products");
	}

	@When("^the user presses Enter on keyboard again$")
	public void the_user_presses_Enter_on_keyboard_again() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys(Keys.RETURN);
	}

	@Then("^the user verifies that the two items are present on the list equal to the ones that the user entered$")
	public void the_user_verifies_that_the_two_items_are_present_on_the_list_equal_to_the_ones_that_the_user_entered() throws Throwable {
		Thread.sleep(2000);
		if(driver.getPageSource().contains("go to the mall")&&driver.getPageSource().contains("buy some products")) 
		{
			Assert.assertTrue(true);
		
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@When("^the user enters 去商\" in the to-do label$")
	public void the_user_enters_去商_in_the_to_do_label() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys("去商\"");
	}

	@When("^the user presses Enter key on keyboard$")
	public void the_user_presses_Enter_key_on_keyboard() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys(Keys.RETURN);
	}

	@When("^the user enters 买一些产品 in the to-do label$")
	public void the_user_enters_买一些产品_in_the_to_do_label() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys("买一些产品");
	}

	@When("^the user presses Enter key on keyboard again$")
	public void the_user_presses_Enter_key_on_keyboard_again() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys(Keys.RETURN);
	}

	@Then("^the user verifies that the two items are present on list equal to the ones that the user entered$")
	public void the_user_verifies_that_the_two_items_are_present_on_list_equal_to_the_ones_that_the_user_entered() throws Throwable {
		Thread.sleep(2000);
		if(driver.getPageSource().contains("去商\\\"")&&driver.getPageSource().contains("买一些产品")) 
		{
			Assert.assertTrue(true);
		
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@When("^the user enters no text in input$")
	public void the_user_enters_no_text_in_input() throws Throwable {
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys("");
	}

	@When("^the user presses the Return key$")
	public void the_user_presses_the_Return_key() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys(Keys.RETURN);
	}

	@Then("^the user verifies that no new task is added$")
	public void the_user_verifies_that_no_new_task_is_added() throws Throwable {
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li[1]/div/label"))!=null) 
		{
			Assert.assertTrue(false);
		
		}
		else {
			Assert.assertTrue(true);
		}
	}

	@When("^the user enters first task in input$")
	public void the_user_enters_first_task_in_input() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys("go to the mall");
	}

	@When("^the user presses Enter key$")
	public void the_user_presses_Enter_key() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys(Keys.RETURN);
	}

	@When("^the user clicks on the Completed label$")
	public void the_user_clicks_on_the_Completed_label() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/td-todos/section/footer/iron-selector/li[3]/a")).click();
	}

	@When("^the user enters the second task$")
	public void the_user_enters_the_second_task() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys("buy some products");
	}

	@When("^the user presses the Enter key again$")
	public void the_user_presses_the_Enter_key_again() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new-todo\"]")).sendKeys(Keys.RETURN);
	}

	@When("^the user clicks on the All label$")
	public void the_user_clicks_on_the_All_label() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/td-todos/section/footer/iron-selector/li[1]/a")).click();
	}

	@Then("^the user verifies that the two active tasks are on the menu$")
	public void the_user_verifies_that_the_two_active_tasks_are_on_the_menu() throws Throwable {
		Thread.sleep(2000);
		if(driver.getPageSource().contains("go to the mall")&&driver.getPageSource().contains("buy some products")) 
		{
			Assert.assertTrue(true);
		
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
