package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewRegistrationSteps {
	public ChromeDriver driver;
	Faker faker=new Faker();
	String generatePassword;
	
	
	@Given("Launch the browser and click the registration link")
	public void launch_the_browser_and_click_the_registration_link() {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://live-uat.d2l5ex60a7etci.amplifyapp.com/rfp");
		 driver.findElement(By.xpath("//span[text()='Register']")).click();
	}

	@When("Enter the First Name as {string}")
	public void enter_the_first_name_as(String FirstName) {
		 driver.findElement(By.id("firstName")).sendKeys(FirstName);
	}

	@When("Enter the Last Name as {string}")
	public void enter_the_last_name_as(String LastName) {
		 driver.findElement(By.id("lastName")).sendKeys(LastName);
	}

	@When("Enter the Email id as {string}")
	public void enter_the_email_id_as(String YourEmailAddress) {
		 driver.findElement(By.id("email")).sendKeys(YourEmailAddress);
	}

	@When("Enter the Job Title as {string}")
	public void enter_the_job_title_as(String JobTitle) {
		 driver.findElement(By.id("jobTitle")).sendKeys(JobTitle);
	}

	@When("Enter the Phone Number as {string}")
	public void enter_the_phone_number_as(String PhoneNumber) {
		driver.findElement(By.id("phone")).sendKeys(PhoneNumber);
	}

	@When("Enter the Company Name as {string}")
	public void enter_the_company_name_as(String CompanyName) {
		driver.findElement(By.id("company")).sendKeys(CompanyName);
	}

	@When("Enter the Website URL as {string}")
	public void enter_the_website_url_as(String WebsiteURL) {
		 driver.findElement(By.id("website")).sendKeys(WebsiteURL);
	}

	@When("select any industry from the drop-down as {string}")
	public void select_any_industry_from_the_drop_down_as(String Industry) {
		
		WebElement dropDown= driver.findElement(By.id("industry"));
		dropDown.click();
		driver.findElement(By.xpath("//input[@role=\"searchbox\"]")).sendKeys(Industry);
		driver.findElement(By.xpath("//div[text()='"+Industry+"']")).click();
		
		
	}

	@When("select the check box")
	public void select_the_check_box() {
		driver.findElement(By.xpath("//div[@class=\"p-checkbox-box\"]")).click();
	}

	@When("click on Continue Registration")
	public void click_on_continue_registration() {
		driver.findElement(By.xpath("//span[text()='Continue Registration']")).click(); // Write code here that turns the phrase above into concrete actions
	    
	}


    @When("The system generates a dynamic password")
    public void the_system_generates_a_dynamic_password() {
    generatePassword =faker.internet().password(8, 16, true, true, true);
    }

    @When("The user enter the password and reconfirm the same")
    public void the_user_enter_the_password_and_reconfirm_the_same() {
        driver.findElement(By.xpath("//input[@label='Password']")).sendKeys(generatePassword);
        driver.findElement(By.xpath("//input[@label='Confirm Password']")).sendKeys(generatePassword);
    }

	@Then("Account should be created")
	public void account_should_be_created() {
		 driver.findElement(By.xpath("//span[text()='Complete Registration']")).click();
	}
}
