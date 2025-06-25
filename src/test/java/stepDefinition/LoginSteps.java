package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;


@Given("Launch the browser and ArenaCX login page is loaded")
public void launch_the_browser_and_arena_cx_login_page_is_loaded() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://live-uat.d2l5ex60a7etci.amplifyapp.com/rfp");

}

@When("Enter the username as sankar.govindharaj@qeagle.com")
public void enter_the_username_as_sankar_govindharaj_qeagle_com() {
	 driver.findElement(By.xpath("(//input[@class='p-inputtext p-component'])[1]")).sendKeys("sankar.govindharaj@qeagle.com");

}

@When("Enter the password as Qeagle@{int}")
public void enter_the_password_as_qeagle(Integer int1) {
	 driver.findElement(By.xpath("//input[@label='Password']")).sendKeys("Qeagle@123");

}

@When("Click on the login button")
public void click_on_the_login_button() {
	 driver.findElement(By.xpath("//span[@class='p-button-label']")).click();

}

@Then("The user should successfully logged in")
public void the_user_should_successfully_logged_in() {
	String title=driver.getTitle();
	   System.out.println(title);
		    if(title.contains("ArenaCX RFPerfect"))
		    {
		    	System.out.println("Login is Successful");
		    }
		    else {
		    	System.out.println("Login is not Successful");
		    }
}


	}
