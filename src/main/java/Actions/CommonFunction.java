package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonFunction {

	public static WebDriver driver;

	public static void invokeBrowser(String browserName, String url) {

		switch (browserName.toLowerCase()) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

			driver = new ChromeDriver();

			break;

		case "firefox":

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

			driver = new FirefoxDriver(new FirefoxOptions().setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));

			break;

		case "edge":

			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/drivers/msedgedriver.exe");

			driver = new EdgeDriver();

			break;

		case "ie":

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/iedriver.exe");

			driver = new InternetExplorerDriver();

			break;

		default:

			System.out.println(browserName + " is invalid!!!");

		}

		driver.manage().window().maximize();

		driver.get(url);

	}

	public static WebElement findElement(By obj) {

		return driver.findElement(obj);
	}

	public static void sendKeys(By obj, String value) {

		findElement(obj).sendKeys(value);
	}

	public static void click(By obj) {

		findElement(obj).click();
	}

	public static String getElementText(By obj) {
		
		return findElement(obj).getText();
	}

}
