package StepDefinitions;

import Actions.CommonFunction;
import Objects.LoginObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login_testcases extends CommonFunction implements LoginObjects {
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		
	   invokeBrowser("chrome", "https://the-internet.herokuapp.com/login");
	   
	}

	@Then("user enter his valid username and password")
	public void user_enter_his_valid_username_and_password() {
		
		sendKeys(loginUserNameField, "tomsmith");
		sendKeys(loginPasswordField, "SuperSecretPassword!");
	    
	}

	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		
		click(loginButton);
	    
	}

	@Then("user verify whether he is successfully logged in")
	public void user_verify_whether_he_is_successfully_logged_in() {
		
		if(!getElementText(loginMessage).isEmpty()) {
			
			System.out.println("Passed!!!");
			
		}
	    
	}

	@Then("user enter his invalid username and password")
	public void user_enter_his_invalid_username_and_password() {
		
		sendKeys(loginUserNameField, "invalid");
		sendKeys(loginPasswordField, "invalid");
	    
	}

}
