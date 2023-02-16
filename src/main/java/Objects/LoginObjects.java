package Objects;

import org.openqa.selenium.By;

public interface LoginObjects {
	
	public static By loginUserNameField = By.id("username");
	
	public static By loginPasswordField = By.xpath("//input[@id='password']");
	
	public static By loginButton = By.cssSelector("button.radius");
	
	public static By loginMessage = By.id("flash");

}
