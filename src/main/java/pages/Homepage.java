package pages;

import com.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {
    String menu;

    By mouseHoverOnDesktop = By.xpath("//a[normalize-space()='Desktops']");
    By selectShowAllDesktop = By.xpath("//a[normalize-space()='Show AllDesktops']");
    By verifyTheTextDesktop = By.xpath("//h2[contains(text(),'Desktops')]");
    By mouseHoverOnLaptopsAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By verifyTheTextLaptopsAndNoteBooks = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");
    By mouseHoverOnComponents = By.xpath("//a[normalize-space()='Components']");

    By verifyTheTextComponents = By.xpath("//h2[contains(text(),'Components')]");
        public void selectMenu(String menu){
            this.menu = menu;
            clickOnElement(By.xpath(menu));
        }
        public void check(){
            menu = "//a[normalize-space()='Desktops']";
            selectMenu(menu);
        }
        public void check1(){
            menu = "//a[normalize-space()='Show AllLaptops & Notebooks']";
            selectMenu(menu);
        }
        public void check2(){
            menu = "//a[contains(text(),'Show AllComponents')]";
            selectMenu(menu);
        }
        public void setMouseHoverOnDesktop(){
            mouseHoverToElement(mouseHoverOnDesktop);
        }
        public void setSelectShowAllDesktop(){
            clickOnElement(selectShowAllDesktop);
        }
        public String setVerifyTheTextDesktop(){
            return getTextFromElement(verifyTheTextDesktop);
        }
        public void setMouseHoverOnLaptopsAndNotebooks(){
            mouseHoverToElementAndClick(mouseHoverOnLaptopsAndNotebooks);
        }
        public String setVerifyTheTextLaptopsAndNoteBooks(){
            return getTextFromElement(verifyTheTextLaptopsAndNoteBooks);
        }
        public void setMouseHoverOnComponents(){
            mouseHoverToElement(mouseHoverOnComponents);
        }
        public String setVerifyTheTextComponents(){
            return getTextFromElement(verifyTheTextComponents);
        }


}
