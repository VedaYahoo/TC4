package base;

import objectrepository.AweUiObj;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class BaseUtil {
    public static WebDriver driver;
    private static final int pageElementLoadWait = 30;

    public static HashMap<WebElement, String> elementDetails = new HashMap<WebElement, String>();

    public boolean clickElement(WebElement element) {
        boolean flag = false;
        try {
//            WebDriverWait wait = new WebDriverWait(driver, pageElementLoadWait);
//            wait.until(ExpectedConditions.elementToBeClickable(element));
            Thread.sleep(500);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            System.out.println(elementDetails.get(element) + " - Element Clicked");

            flag = true;
        } catch (Exception  e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    /**
     * Enter text in text box method.
     *
     * @param element
     * @param input
     * @return, ExtentTest report
     */
    public boolean enterText(WebElement element, String input) {
        boolean flag=false;
        try {
            if (clickElement(element)){
                Thread.sleep(500);
                element.clear();
                Thread.sleep(500);
                element.sendKeys(input);
                System.out.println(elementDetails.get(element) + " - Entered the text - "+input);
                flag=true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return  flag;
    }
}