package steps_Support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testhelper {

	protected WebDriver driver;

	public WebDriver getDriver(String br) {
		String browser = br;

		if (browser == "Chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		} else if (browser == "IE") {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			return driver;
		} else if (browser == "Firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			return driver;
		}
		return driver;
	}

	public void lunchBrowser() {
		// driver.navigate().to("https://www.demo.iscripts.com/multicart/demo/index.php");
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
	}

}
