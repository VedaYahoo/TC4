package objectrepository;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AweUiObj extends BaseUtil {

    public AweUiObj(WebDriver driver) {
        PageFactory.initElements(driver, this);
        //Log.info("Inside RequestAbsenceAndTimeOffObj objects");
    }

    @FindBy(xpath = "//*[@id=\"txtGridFrowSrc\"]")
    public WebElement txtSearchGridFilter;

    @FindBy(xpath = "//*[@id=\"GridFrow\"]/div[3]/div[2]/div/table/tbody/tr/td[1]")
    public WebElement IDRowValue;

    @FindBy(xpath = "//*[@id=\"GridFrow\"]/div[3]/div[2]/div/table/tbody/tr/td[2]")
    public WebElement PersonRowValue;

    @FindBy(xpath = "//*[@id=\"GridFrow\"]/div[3]/div[2]/div/table/tbody/tr/td[3]/text()")
    public WebElement FoodRowValue;

    @FindBy(xpath = "//*[@id=\"GridFrow\"]/div[3]/div[2]/div/table/tbody/tr/td[4]")
    public WebElement CountryRowValue;

    @FindBy(xpath = "//*[@id=\"GridFrow\"]/div[3]/div[2]/div/table/tbody/tr/td[5]")
    public WebElement DateRowValue;

    @FindBy(xpath = "//*[@id=\"GridFrow\"]/div[3]/div[2]/div/table/tbody/tr/td[6]")
    public WebElement MealsRowValue;

    @FindBy(xpath = "//*[@id=\"GridFrow\"]/div[3]/div[2]/div/table/tbody/tr/td[7]]")
    public WebElement ChefRowValue;

}
