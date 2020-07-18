package steps_PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage extends MasterPage {

	String emailLink ="//*[@id=\"identifierId\"]";
	String nextLink ="//*[@id=\"identifierNext\"]/span";//*[@id="password"]/div[1]/div/div[1]/input
	String passwordLink ="//input[@name='password']";
	String nextlink1 ="//*[@id=\"passwordNext\"]/span";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void Dologin() throws InterruptedException {
		clickOnElement(emailLink);
		Thread.sleep(5000);
		//uglyWaitFor(5000);
		SendDataOnElement(emailLink,"duibatpar420@gmail.com");
		clickOnElement(nextLink);
        //uglyWaitFor(5000);
		Thread.sleep(5000);
		SendDataOnElement(passwordLink,"420batpar");
		clickOnElement(nextlink1);
		
	
	
	
	
	}

	
	}
	
	

