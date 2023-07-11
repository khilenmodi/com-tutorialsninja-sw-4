package pages;

import com.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooks extends Utility {

    By mouseHoverOnLaptopsAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By clickOnShowAllLaptopsAndNotebooks = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");
    By sortByPrice = By.xpath("//select[@id='input-sort']");
    By selectMacBook = By.xpath("//a[normalize-space()='MacBook']");
    By verifyTextMacbook = By.xpath("//h1[normalize-space()='MacBook']");
    By clickOnAddToCartButton = By.xpath("//button[@id='button-cart']");
    By VerifyTheSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By clickOnShoppingCartButton = By.xpath("//a[contains(text(),'shopping cart')]");

    By verifyTheMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By verifyTheTextMacBook = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By changeTheQty2 = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By clickOnRefreshButton = By.xpath("//i[@class='fa fa-refresh']");
    By VerifyUpdatedCart = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By clickOnCurrency = By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]");
    By verifyTheTotal = By.xpath("//tbody//tr//td[6]");
    By clickOnCheckout = By.xpath("//a[contains(text(),'Checkout')]");
    By verifyTheTextCheckout = By.xpath("//h1[normalize-space()='Checkout']");
    By verifyTheNewCustomer = By.xpath("//h2[contains(text(),'New Customer')]");
    By clickOnGuestCheckout = By.xpath("//input[@value='guest']");
    By ClickOnContinue = By.xpath("//input[@id='button-account']");
    By firstName  = By.id("input-payment-firstname");
    By lastName =By.id("input-payment-lastname");
    By eMail = By.id("input-payment-email");
    By telephone = By.id("input-payment-telephone");
    By Address1 = By.id("input-payment-address-1");
    By city = By.id("input-payment-city");
    By postcode = By.id("input-payment-postcode");
    By country = By.id("input-payment-country");
    By state = By.id("input-payment-zone");
    By clickOnCon = By.id("button-guest");
    By enterComment = By.name("comment");
    By tickCheckBox = By.xpath("//input[@name='agree']");
    By continueClicking = By.xpath("//input[@id='button-payment-method']");
    By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public void setMouseHoverOnLaptopsAndNotebooks(){
        mouseHoverToElement(mouseHoverOnLaptopsAndNotebooks);
        clickOnElement(mouseHoverOnLaptopsAndNotebooks);
    }
    public void setClickOnShowAllLaptopsAndNotebooks(){
        clickOnElement(clickOnShowAllLaptopsAndNotebooks);
    }
    public void setSortByPrice(){
        selectByVisibleTextFromDropDown(sortByPrice,"Price (High > Low)");
    }
    public void setSelectMacBook(){
        clickOnElement(selectMacBook);
    }
    public String setVerifyTextMacbook(){
        return getTextFromElement(verifyTextMacbook);
    }
    public void setClickOnAddToCartButton(){
        clickOnElement(clickOnAddToCartButton);
    }
    public String setVerifyTheSuccessMessage(){
        return getTextFromElement(VerifyTheSuccessMessage);
    }
    public void setClickOnShoppingCartButton(){
        clickOnElement(clickOnShoppingCartButton);
    }
    public String setVerifyTheMessageShoppingCart(){
        return  getTextFromElement(verifyTheMessageShoppingCart);
    }
    public String setVerifyTheTextMacBook(){
        return getTextFromElement(verifyTheTextMacBook);
    }
    public void setChangeTheQty2(){
        driver.findElement(changeTheQty2).clear();
        sendTextToElement(changeTheQty2,"2");
    }
    public void setClickOnRefreshButton(){
        clickOnElement(clickOnRefreshButton);
    }
    public String setVerifyUpdatedCart(){
        return  getTextFromElement(VerifyUpdatedCart);
    }
    public void setClickOnCurrency(){
        selectByVisibleTextFromDropDown(clickOnCurrency,"£Pound Sterling");
    }
    public String setVerifyTheTotal(){
        return getTextFromElement(verifyTheTotal);
    }
    public void setClickOnCheckout(){
        clickOnElement(clickOnCheckout);
    }
    public String setVerifyTheTextCheckout(){
        return getTextFromElement(verifyTheTextCheckout);
    }
    public String setVerifyTheNewCustomer(){
        return getTextFromElement(verifyTheNewCustomer);
    }
    public void setClickOnGuestCheckout(){
        clickOnElement(clickOnGuestCheckout);
    }
    public void setClickOnContinue(){
        clickOnElement(ClickOnContinue);
    }

    public void enterFirstName(){
        sendTextToElement(firstName,"khilen");
    }
    public void enterLastName(){
        sendTextToElement(lastName,"Modi");
    }
    public void enterEmail(){
        sendTextToElement(eMail,"khilenModi12345@yahoo.com");
    }
    public void enterTelephone() {
        sendTextToElement(telephone, "07206317502");
    }
        public void enterAddress1(){
        sendTextToElement(Address1,"20 Tudor Avanue");
    }
    public void enterCity(){
        sendTextToElement(city,"Watford");
    }
    public void enterPostcode(){
        sendTextToElement(postcode,"WD17 5GC");
    }
    public void enterCountry(){
        selectByVisibleTextFromDropDown(country,"United Kingdom");
    }
    public void enterState(){
        selectByVisibleTextFromDropDown(state,"Hertfordshire");
    }
    public void setClickOnCon(){
        clickOnElement(clickOnCon);
    }
    public void setEnterComment(){
        sendTextToElement(enterComment,"Please leave my parcel at nextDoor Neighbour");
    }
    public void setTickCheckBox(){
        clickOnElement(tickCheckBox);
    }
    public void setContinueClicking(){
        clickOnElement(continueClicking);
    }
    public String setWarningMessage(){
        return getTextFromElement(warningMessage);
    }

}
