package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    private WebElement dropDownMenu;


    @FindBy(xpath = "//*[text()='Register']")
    private WebElement registerButton;


    public void clickDropDownMenu(){
        dropDownMenu.click();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }







}
