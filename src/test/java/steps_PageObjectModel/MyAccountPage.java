package steps_PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends MasterPage {

	String inboxlink = "//div[@class='TN bzz aHS-bnt']";
	String searchboxLink = "//input[@placeholder='Search mail']";
	String selectLink = "//div[@class='J-J5-Ji J-JN-M-I-Jm']//div[@class='G-asx T-I-J3 J-J5-Ji']";
	String deleteLink = "//*[@aria-label='Delete']";
	String selectLink1 ="(//*[@class='G-asx T-I-J3 J-J5-Ji'])[7]";
	String selectLink2 ="(//*[@selector='all']/div)[2]";
	//String selectLink1 = "//*[@class='D E G-atb PY']/div[2]/div[1]/div/div/div[1]/div/div[1]/span/div";
	
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public void searhEmailAndDelete(String searchEmail) throws Exception {

		// clickOnElement(inboxlink);
		uglyWaitFor(3000);
		clickOnElement(searchboxLink);
		SendDataOnElement(searchboxLink, searchEmail);
		WebElement enter = driver.findElement(By.xpath(searchboxLink));
		enter.sendKeys(Keys.ENTER);
		uglyWaitFor(5000);
		elementExist(selectLink1);
		clickOnElement(selectLink1);
		clickOnElement(selectLink2);
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().to("https://mail.google.com/mail/u/0/#search/saifur");
		clickOnElement(deleteLink);
		
		
		
		// dropDown(selectLink1, "All");

		/*
		 * List<WebElement> mail =
		 * driver.findElements(By.xpath("//*[@class='yW']/span"));
		 * 
		 * String MyMail = "Saifur Rahman Rana";
		 * 
		 * System.out.println(mail.size()); for (int i = 0; i < mail.size(); i++) {
		 * System.out.println(mail.get(i).getText());
		 * 
		 * if (mail.get(i).getText().equals(MyMail)) { { mail.get(i).click();
		 * clickOnElement(deleteLink); // uglyWaitFor(1000); driver.navigate().back();
		 * 
		 * }
		 * 
		 * } }
		 */
	}

}
