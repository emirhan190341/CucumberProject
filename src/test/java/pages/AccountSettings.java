package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;


public class AccountSettings {

    Faker faker = new Faker();

    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By email = By.name("email");
    By languageDropDown = By.name("langKey");
    By englishLanguage = By.xpath("//option[@value='en']");
    By saveButton = By.xpath("//button[@type='submit']");
    By turkishLanguage = By.xpath("//option[@value='tr']");



    private WebElement getFirstName(){
        return Driver.getDriver().findElement(firstName);
    }

    private WebElement getLastName(){
        return Driver.getDriver().findElement(lastName);
    }

    private WebElement getEmail(){
        return Driver.getDriver().findElement(email);
    }

    private WebElement getLanguage(){
        return Driver.getDriver().findElement(languageDropDown);
    }


    private WebElement getEnglishLanguage(){
        return Driver.getDriver().findElement(englishLanguage);
    }

    private WebElement getSaveButton(){
        return Driver.getDriver().findElement(saveButton);
    }

    private WebElement getTurkishLanguage(){
        return Driver.getDriver().findElement(turkishLanguage);
    }



    public void  firstNameAssertion(){

        Assert.assertEquals("Team35",getFirstName().getAttribute("value"));

    }
    public void  lastNameAssertion(){
        Assert.assertEquals("GmiBankProject",getLastName().getAttribute("value"));
    }
    public void  emailAssertion(){
        Assert.assertEquals("team35@winners.com",getEmail().getAttribute("value"));
    }

    public void englishAssertion(){
        Assert.assertTrue(getEnglishLanguage().isDisplayed());
    }


    public void clickLanguageDropDown(){
        getLanguage().click();
    }

    public void selectLanguageDropDown(){
        Select select = new Select(getLanguage());
        select.selectByValue("tr");
    }

    public void clickSaveButton(){
        getSaveButton().click();
    }

    public void hasChanged(){
        Assert.assertTrue(getTurkishLanguage().isDisplayed());
    }

    public void clickFirstNameBox(){
        getFirstName().click();
    }

    public void changeFirstNameData(){
        getFirstName().clear();
        getFirstName().sendKeys(faker.name().firstName());
    }

    public void firstNameHasChanged(){
        String expected="Team35";
        String actual=getEmail().getAttribute("value");
        Assert.assertNotEquals(expected,actual);
        System.out.println("Name has changed");
    }
























}
