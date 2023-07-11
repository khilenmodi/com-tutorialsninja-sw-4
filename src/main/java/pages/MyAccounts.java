package pages;

import com.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccounts extends Utility {
    String option;
    String  getListOfElements;
    String Register;
    By ClickOnMyAccountLink = By.xpath("//span[normalize-space()='My Account']");
    By verifyTheTextRegisterAccount = By.xpath("//h1[normalize-space()='Register Account']");

    By VerifyTextReturningCustomer = By.xpath("//h2[normalize-space()='Returning Customer']");
    By Myaccount = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By firstName  = By.id("input-firstname");
    By lastName =By.id("input-lastname");
    By eMail = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By passwordConfirm = By.name("confirm");
    By selectRadioButton = By.name("newsletter");
    By privacyPolicy = By.name("agree");
    By clickContinue = By.xpath("//input[@value='Continue']");
    By verifyTextMessage = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By clickingContinue = By.xpath("//a[@class='btn btn-primary']");
    By myAccountLink = By.xpath("//span[normalize-space()='My Account']");
    By clickOnLogin = By.xpath("//input[@value='Login']");
    By clickOnLogOut = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");
    By verifyTheTextAccountLogOut = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueToClick = By.xpath("//a[@class='btn btn-primary']");

    By verifyTextMyAccount = By.xpath("//h2[normalize-space()='My Account']");
    public void selectMyAccountOption(String option) {
        WebElement select = driver.findElement(By.xpath("//a[@title='My Account']"));
        List<WebElement> options = select.findElements(By.xpath("//a[normalize-space()='Register']"));

        if (option == "Register")
        for (WebElement option1 : options) {

            if (option.equals(option1.getText())) {
                option1.click();
            }

        }
        if (option == "Login") ;
        WebElement select1 = driver.findElement(By.xpath("//a[@title='My Account']"));
        List<WebElement> options1 = select1.findElements(By.xpath("//a[normalize-space()='Login']"));

        for (WebElement option2 : options1) {

            if (option.equals(option2.getText())) {
                option2.click();
            }

        }
        if (option == "Logout") ;
        WebElement select2 = driver.findElement(By.xpath("//a[@title='My Account']"));
        List<WebElement> options2 = select2.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']"));

        for (WebElement option3 : options2) {

            if (option.equals(option3.getText())) {
                option3.click();
            }

        }
    }
    public void setClickOnMyAccountLink(){
        clickOnElement(ClickOnMyAccountLink);
    }
    public String setVerifyTheTextRegisterAccount(){
        return getTextFromElement(verifyTheTextRegisterAccount);
    }
    public String setVerifyTextReturningCustomer(){
        return getTextFromElement(VerifyTextReturningCustomer);
    }
    public void setMyaccount(){
        clickOnElement(Myaccount);
    }
    public void setFirstName(){
        sendTextToElement(firstName,"khilen");
    }
    public void setLastName(){
        sendTextToElement(lastName,"Modi");
    }
    public void setEMail(){
        sendTextToElement(eMail,"khilenmodi1234@yahoo.com");
    }
    public void setTelephone(){
        sendTextToElement(telephone,"07912375610");
    }
    public void setPassword(){
        sendTextToElement(password,"khilen123");
    }
    public void setPasswordConfirm(){
        sendTextToElement(passwordConfirm,"khilen123");
    }
    public void setSelectRadioButton(){
        clickOnElement(selectRadioButton);
    }
    public void setPrivacyPolicy(){
        clickOnElement(privacyPolicy);
    }
    public void setClickContinue(){
        clickOnElement(clickContinue);
    }
    public String setVerifyTextMessage(){
        return getTextFromElement(verifyTextMessage);
    }
    public void setClickingContinue(){
        clickOnElement(clickingContinue);
    }
    public void setMyAccountLink(){
        clickOnElement(myAccountLink);
    }
    public void setClickOnLogOut(){
        clickOnElement(clickOnLogOut);
    }
    public String setVerifyTheTextAccountLogOut(){
        return getTextFromElement(verifyTheTextAccountLogOut);
    }

    public void setContinueToClick(){
        clickOnElement(continueToClick);
    }
    public void setClickOnLogin(){
        clickOnElement(clickOnLogin);
    }
    public String setVerifyTextMyAccount(){
       return getTextFromElement (verifyTextMyAccount);
    }
}

