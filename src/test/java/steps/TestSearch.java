package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import io.cucumber.java.en.Then;

public class TestSearch {

    WebDriver driver = new ChromeDriver();

    HomePage homePage;
	LoginPage loginPage;
	
    @Given("User is on the FirstCry homepage")
    public void userIsOnTheFirstCryHomepage() {
        driver.get("https://www.firstcry.com/");
    }

    @Then("User should see the search bar")
    public void userShouldSeeTheSearchBar() {
        WebElement searchBar = driver.findElement(By.id("search_box")); 
        assert searchBar.isDisplayed();
    }

    @When("User enters a valid product name in the search bar")
    public void userEntersAValidProductNameInTheSearchBar() {
        WebElement searchInput = driver.findElement(By.id("search_box")); 
        searchInput.clear(); 
        searchInput.sendKeys("shoes");
    }

    @When("User clicks on the search button")
    public void userClicksOnTheSearchButton() {
    	WebElement searchButton = driver.findElement(By.xpath("//span[@class='search-button']")); 
        searchButton.click();
    }

}

