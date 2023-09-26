package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class PullRecordSteps {

    //WebDriver driver;

    @Given("Open browser and launch page")
    public void open_browser_and_launch_page() {
//        System.out.println("\nOpen browser and launch page");
//        /Users/davebrextolentino/Downloads/chromedriver-mac-x64
//        /Users/davebrextolentino/Downloads/chromedriver_mac_arm64OLD
        System.setProperty("webdriver.chrome.driver", "/Users/davebrextolentino/Downloads/chromedriver_mac_arm64OLD/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }

    @When("Enter value in text field")
    public void enter_value_in_text_field() {
        System.out.println("\nEnter value in text field");
    }

    @Then("Pull records from input")
    public void pull_records_from_input() {
        System.out.println("\nPull records from input");
    }

    @Then("Close browser")
    public void close_browser() {
        System.out.println("\nClose browser");
    }
}