package testsuite;

import com.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LaptopsAndNotebooks;

public class LaptopsAndNotebooksTest extends BaseTest {

        LaptopsAndNotebooks laptopsAndNotebooks = new LaptopsAndNotebooks();

        @Test
        public void verifyProductsPriceDisplayHighToLowSuccessfully(){
            //1.1 Mouse hover on Laptops & Notebooks Tab.and click
            laptopsAndNotebooks.setMouseHoverOnLaptopsAndNotebooks();
            //1.2 Click on “Show All Laptops & Notebooks”
            laptopsAndNotebooks.setClickOnShowAllLaptopsAndNotebooks();
            //1.3 Select Sort By "Price (High > Low)"
            laptopsAndNotebooks.setSortByPrice();
            //1.4 Verify the Product price will arrange in High to Low order.

        }
        @Test
        public void verifyThatUserPlaceOrderSuccessfully(){
            //2.1 Mouse hover on Laptops & Notebooks Tab and click
            laptopsAndNotebooks.setMouseHoverOnLaptopsAndNotebooks();
            //2.2 Click on “Show All Laptops & Notebooks”
            laptopsAndNotebooks.setClickOnShowAllLaptopsAndNotebooks();
            //2.3 Select Sort By "Price (High > Low)"
            laptopsAndNotebooks.setSortByPrice();
            //2.4 Select Product “MacBook”
            laptopsAndNotebooks.setSelectMacBook();
            //2.5 Verify the text “MacBook”
            String actualMessage = laptopsAndNotebooks.setVerifyTextMacbook();
            String expectedMessage = "MacBook";
            Assert.assertEquals(actualMessage,expectedMessage,"Display the message is not Macbook");
            //2.6 Click on ‘Add To Cart’ button
            laptopsAndNotebooks.setClickOnAddToCartButton();
            //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
            String actualMessage1 = laptopsAndNotebooks.setVerifyTheSuccessMessage();
            String expectedMessage1 = "Success: You have added MacBook to your shopping cart!\n"+
                    "×";
            Assert.assertEquals(actualMessage1,expectedMessage1,"Display the message is not Macbook");
            //2.8 Click on link “shopping cart” display into success message
            laptopsAndNotebooks.setClickOnShoppingCartButton();
            //2.9 Verify the text "Shopping Cart"
            String actualTxt = laptopsAndNotebooks.setVerifyTheMessageShoppingCart();
            String expectedTxt = "Shopping Cart  (0.00kg)";
            Assert.assertEquals(actualTxt,expectedTxt,"Shopping Cart  (0.00kg) is not displayed");
            //2.10 Verify the Product name "MacBook"
            String actualTxt1 = laptopsAndNotebooks.setVerifyTheTextMacBook();
            String expectedTxt1 = "MacBook";
            Assert.assertEquals(actualTxt1,expectedTxt1,"MacBook is not displayed");
            //2.11 Change Quantity "2"
            laptopsAndNotebooks.setChangeTheQty2();
            //2.12 Click on “Update” Tab
            laptopsAndNotebooks.setClickOnRefreshButton();
            //2.13 Verify the message “Success: You have modified your shopping cart!”
            String actualTxt2 = laptopsAndNotebooks.setVerifyUpdatedCart();
            String expectedTxt2 = "Success: You have modified your shopping cart!\n"+
                    "×";
            Assert.assertEquals(actualTxt2,expectedTxt2,"Success: You have modified your shopping cart! is not displayed");
            //2.14 Verify the Total $1,204.00
            //laptopsAndNotebooks.setClickOnCurrency();
            String actualTxt3 = laptopsAndNotebooks.setVerifyTheTotal();
            String expectedTxt3 = "$1,204.00";
            Assert.assertEquals(actualTxt3,expectedTxt3,"$1,204.00 is not displayed");
            //2.15 Click on “Checkout” button
            laptopsAndNotebooks.setClickOnCheckout();
            //2.16 Verify the text “Checkout”
            String actualTxt4 = laptopsAndNotebooks.setVerifyTheTextCheckout();
            String expectedTxt4 = "Checkout";
            Assert.assertEquals(actualTxt4,expectedTxt4,"Checkout is not displayed");
            //2.17 Verify the Text “New Customer”
            String actualTxt5 = laptopsAndNotebooks.setVerifyTheNewCustomer();
            String expectedTxt5 = "New Customer";
            Assert.assertEquals(actualTxt5,expectedTxt5,"New Customer is not displayed");
            //2.18 Click on “Guest Checkout” radio button
            laptopsAndNotebooks.setClickOnGuestCheckout();
            //2.19 Click on “Continue” tab
            laptopsAndNotebooks.setClickOnContinue();
            //2.20 Fill the mandatory fields
            laptopsAndNotebooks.enterFirstName();
            laptopsAndNotebooks.enterLastName();
            laptopsAndNotebooks.enterEmail();
            laptopsAndNotebooks.enterTelephone();
            laptopsAndNotebooks.enterAddress1();
            laptopsAndNotebooks.enterCity();
            laptopsAndNotebooks.enterPostcode();
            laptopsAndNotebooks.enterCountry();
            laptopsAndNotebooks.enterState();
            //2.21 Click on “Continue” Button
            laptopsAndNotebooks.setClickOnCon();
            //2.22 Add Comments About your order into text area
            laptopsAndNotebooks.setEnterComment();
            //2.23 Check the Terms & Conditions check box
            laptopsAndNotebooks.setTickCheckBox();
            //2.24 Click on “Continue” button
            laptopsAndNotebooks.setContinueClicking();
            //2.25 Verify the message “Warning: Payment method required!”
            String actualMessage5 = laptopsAndNotebooks.setWarningMessage();
            String expectedMessage5 = "Warning: Payment method required!\n"+
                    "×";
            Assert.assertEquals(actualMessage5,expectedMessage5,"Warning: Payment method required! is not displayed");
        }

}
