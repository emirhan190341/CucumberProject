package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {

    By userName = By.name("username");
    By password = By.name("password");
    By signInButton = By.className("btn-primary");

    private WebElement getUserName(){
        return Driver.getDriver().findElement(userName);
    }

    private WebElement getPassword(){
        return Driver.getDriver().findElement(password);
    }

    private WebElement getSignInButton(){
        return Driver.getDriver().findElement(signInButton);
    }

    public void sendUsername(String string){
        getUserName().sendKeys(string);
    }

    public void sendPassword(String string){
        getPassword().sendKeys(string);
    }

    public void clickSignInButton(){
        getSignInButton().click();
    }



}
