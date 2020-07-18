package steps_Main;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps_PageObjectModel.HomePage;
import steps_PageObjectModel.MyAccountPage;
import steps_Support.Testhelper;

public class Main_steps_login {

	WebDriver driver;
	Testhelper helper;
	// Testhelper helper = new Testhelper();
	HomePage homepage;
	// HomePage homepage = new HomePage(driver);
	// ResigtrationPage respage;
	String resUserData;
	MyAccountPage myaccountPage;
	// myaccountPage = new MyAccountPage(driver);

 //@After
 //public void rampDown() 
 //{ 
 //driver.close(); 
//}

	@Given("^I open browser$")
	public void i_open_browser() {

		helper = new Testhelper();
		driver = helper.getDriver("Chrome");

	}

	@And("^I land on gmail account page$")
	public void iLandOnGmailAccountPage() {

		helper.lunchBrowser();
	}

	@When("^I complete Login With nr nr$")
	public void iCompleteLoginWithNrNr() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.Dologin();
	}

	/*
	 * @When("^I want to look for desired email$") public void
	 * iWantToLookForDesiredEmail() { myaccountPage = new MyAccountPage(driver);
	 * myaccountPage.searhEmail("saifur"); }
	 */

	@Then("^I expect to select specific email by name and delete them$")
	public void iExpectToSelectSpecificEmailByNameAndDeleteThem() throws Exception {
		myaccountPage = new MyAccountPage(driver);
		myaccountPage.searhEmailAndDelete("saifur");
	}

	// @And("^I navigate to registration page$")
	// public void i_navigate_to_registration_page() {
	// homepage = new HomePage(driver);
	// homepage.nevigateToRegistrationPage();
	// respage = new ResigtrationPage(driver);
	// }

	// @When("^I register with valid credentials for MR X$")
	// public void i_register_with_valid_credentials_for_MR_X() {
	// Random rand = new Random();
	// int rand_int1 = rand.nextInt(1000);
	// resUserData = "name".toUpperCase() + rand_int1;
	// respage.completeRegistration(resUserData);
	// }

//	@When("^I complete Login With JAMES$")
//	public void iCompleteLoginWithJAMES() {
//		 homepage = new HomePage(driver);
//		homepage.Dologin();
//	}
//
//	
//	
//
//	
//	@When("^I landing on my account page$")
//	public void i_landing_on_my_account_page() {
//		homepage.navigateToMyAccountPage();
//	}

}