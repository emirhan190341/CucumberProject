package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import java.util.Arrays;
import java.util.List;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='ssn']")
    private WebElement ssnTextBox;

    @FindBy(partialLinkText = "Ssn is invalid.")
    private WebElement invalidText;


    By SsnInvalid = By.xpath("//div[@class='invalid-feedback']");


    @FindBy(name = "firstPassword")
    private WebElement newPassword;

    @FindBy(className = "//li[@class='point']")
    private WebElement points;

    By strengthBar = By.xpath("//li[@class='point' and @style !='background-color: rgb(221, 221, 221);']");

    By clickSignIn = By.id("login-item");

    private WebElement getClickSignIn(){
        return Driver.getDriver().findElement(clickSignIn);
    }

    private WebElement getSSnInvalid() {
        return Driver.getDriver().findElement(SsnInvalid);
    }


    public void setSsnTextBoxClick() {
        ssnTextBox.click();
    }

    public void SsnTextBoxSend() {
        ssnTextBox.sendKeys("123-45-6789");
    }

    public void validTextControl() {
        boolean textAppearance = Driver.getDriver().getPageSource().contains("Ssn is invalid.");
        Assert.assertFalse(textAppearance);
    }

    public void SsnTextBoxSendWrong(String string) {
        ssnTextBox.sendKeys(string);
    }


    public void invalidTextControl() {
        Assert.assertTrue(getSSnInvalid().isDisplayed());
    }


    public void clickPasswordBox() {
        newPassword.click();
    }

    public void passwordSend(String string) {
        newPassword.sendKeys(string);

    }

    public void clickSignIn(){
        getClickSignIn().click();
    }


    public void passwordStrengthHasNElement(int a) {
        String[] arr = new String[]{
                "rgb(255, 0, 0)",
                "rgb(255, 153, 0)",
                "rgb(255, 255, 0)",
                "rgb(153, 255, 0)"
        };

        List<WebElement> elements = Driver.getDriver().findElements(strengthBar);
        Assert.assertEquals(a, elements.size());

        for (WebElement eachElement : elements) {
            Assert.assertTrue(eachElement.getAttribute("style").contains(arr[a - 1]));

        }
    }
}

