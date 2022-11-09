package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class GmiBankPage {

    By accountMenu = By.id("account-menu");
    By userInfo = By.xpath("//*[(text()='User Info')]");


    private WebElement getAccountMenu(){
        return Driver.getDriver().findElement(accountMenu);
    }

    public void clickAccountMenu(){
        getAccountMenu().click();
    }

    private WebElement getUserInfo(){
        return Driver.getDriver().findElement(userInfo);
    }

    public void clickUserInfo(){
        getUserInfo().click();
    }










}
