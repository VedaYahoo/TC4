package stepDefinition;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectrepository.AweUiObj;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;

public class PullRecordSteps extends BaseUtil {

//    WebDriver driver;
    public static WebDriver driver;
    private final AweUiObj AweObjects = new AweUiObj(driver);

    @Given("Open browser and launch page")
    public void open_browser_and_launch_page() {
        boolean status = false;
        System.out.println("\nOpen browser and launch page");
        System.setProperty("webdriver.chrome.driver", "/Users/davebrextolentino/Downloads/chromedriver_mac_arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://aweui.aspnetawesome.com/Grid/Filtering#Grid-Filter-Row");

        status = driver.findElement(By.xpath("//*[@id=\"maincont\"]/h1")).isDisplayed();    //GridFiltering header
        Assert.assertEquals(true, status);
    }

    @When("Enter value in text field")
    public void enter_value_in_text_field() {
        System.out.println("\nEnter value in text field");

        enterText(AweObjects.txtSearchGridFilter, "Robert");    //Search text field
    }

    @Then("Pull records from input")
    public void pull_records_from_input() {
        System.out.println("\nPulling records from input..");

        System.out.println("\nId number: "+ AweObjects.IDRowValue);
        System.out.println("\nPerson: "+ AweObjects.PersonRowValue);
        System.out.println("\nFood: "+ AweObjects.FoodRowValue);

        System.out.println("\nCountry: "+ AweObjects.CountryRowValue);
        System.out.println("\nDate: "+ AweObjects.DateRowValue);
        System.out.println("\nMeals: "+ AweObjects.MealsRowValue);
        System.out.println("\nChef: "+ AweObjects.ChefRowValue);
    }

    @Then("Close browser")
    public void close_browser() {
        System.out.println("\nClose browser");
        driver.quit();
    }
}