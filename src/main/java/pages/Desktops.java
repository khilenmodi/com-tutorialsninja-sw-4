package pages;

import com.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Desktops extends Utility {
    String year = "2023";
    String month = "November";
    String date = "30";
    By SwitchToPound = By.xpath("//span[normalize-space()='Currency']");
    By mouseHoverOnDesktop = By.xpath("//a[normalize-space()='Desktops']");
    By selectShowAllDesktop = By.xpath("//a[normalize-space()='Show AllDesktops']");
    By sortNameZToA = By.xpath("//select[@id='input-sort']");
    By originalProductList = By.xpath("//h4/a");
    By sortNameAtoZ = By.xpath("//select[@id='input-sort']");
    By selectHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");
    By verifyTextHPLP3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By selectDate = By.xpath("//div[@class = 'input-group date']//button");
    By selectQty = By.xpath("//input[@id='input-quantity']");
    By selectAddToCart = By.xpath("//button[@id='button-cart']");
    By verifyTextSuccess = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By selectTheCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyTheTextShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By verifyTheNameHPLP3065 = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By verifyTheProduct21 = By.xpath("//td[contains(text(),'Product 21')]");
    By deliveryDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By VerifyTotalPrice = By.xpath("//tbody/tr[1]/td[6]");
    public void setSwitchToPound(){
        selectByVisibleTextFromDropDown(SwitchToPound,"£Pound Sterling");
    }
    public void setMouseHoverOnDesktop() {
        mouseHoverToElement(mouseHoverOnDesktop);
    }

    public void setSelectShowAllDesktop() {
        clickOnElement(selectShowAllDesktop);
    }

    public void setSortNameZToA() {
        selectByVisibleTextFromDropDown(sortNameZToA, "Name (Z - A)");
    }

    public void SetSortNameAtoZ () {
        selectByVisibleTextFromDropDown(sortNameAtoZ,"Name (A - Z)");
    }
    public void setSelectHPLP3065(){
        clickOnElement(selectHPLP3065);
    }
    public String setVerifyTextHPLP3065(){
        return getTextFromElement(verifyTextHPLP3065);
    }

    public void setSelectDate(){
        clickOnElement(selectDate);
        while (true){
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String [] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month)&& yer.equalsIgnoreCase(year)){
                break;
            }else{
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e: allDates) {
            if(e.getText().equalsIgnoreCase(date)){
                e.click();
                break;
            }
        }
    }
    public void setSelectQty(){
        driver.findElements(selectDate).clear();
        clickOnElement(selectQty);
    }
    public void setSelectAddToCart(){
        clickOnElement(selectAddToCart);
    }
    public String setVerifyTextSuccess(){
        return  getTextFromElement(verifyTextSuccess);
    }
    public void setSelectTheCart(){
        clickOnElement(selectTheCart);
    }
    public String setVerifyTheTextShoppingCart(){
        return getTextFromElement(verifyTheTextShoppingCart);
    }
    public String setVerifyTheNameHPLP3065(){
        return getTextFromElement(verifyTheNameHPLP3065);
    }
    public String setDeliveryDate(){
        return getTextFromElement(deliveryDate);
    }
    public String setVerifyTheProduct21(){
        return  getTextFromElement(verifyTheProduct21);
    }
    public String setVerifyTotalPrice(){
        return getTextFromElement(VerifyTotalPrice);
    }



}
