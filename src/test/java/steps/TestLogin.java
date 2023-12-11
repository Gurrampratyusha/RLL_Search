package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.HomePage;
import pages.LoginPage;
import pages.base.Base;

public class TestLogin{
	
	HomePage homePage;
	LoginPage loginPage;
	

	@Given("I open the application")
	public void i_open_the_application() {
		homePage = new HomePage(Base.driver);
        loginPage = new LoginPage(Base.driver);
      
	}

	@Given("Click on Login")
	public void click_on_login() {
        homePage.clickOnLogin();
	}

	@When("I give the {string}")
	public void i_give_the(String string) {
		loginPage.email.sendKeys(string);
	}

	@When("Click continue")
	public void click_continue() {
		loginPage.continueBtn.click();
	}

	@When("Give the OTP and click Submit")
	public void give_the_otp_and_click_submit() throws InterruptedException {
		Thread.sleep(30000);
        loginPage.verifyOtpBtn.click();
	}




}
