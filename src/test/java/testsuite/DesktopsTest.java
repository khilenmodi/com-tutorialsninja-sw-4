package testsuite;

import com.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Desktops;

public class DesktopsTest extends BaseTest {

    Desktops desktops = new Desktops();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
       //1.1 Mouse hover on Desktops Tab.and click
        desktops.setMouseHoverOnDesktop();
        //1.2 Click on “Show All Desktops”
        desktops.setSelectShowAllDesktop();
       //1.3 Select Sort By position "Name: Z to A"
        desktops.setSortNameZToA();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException{
        //2.1 Mouse hover on Desktops Tab. and click
        desktops.setMouseHoverOnDesktop();
        //2.2 Click on “Show All Desktops”
        desktops.setSelectShowAllDesktop();
        //2.3 Select Sort By position "Name: A to Z"
        desktops.SetSortNameAtoZ();
        //2.4 Select product “HP LP3065”
        desktops.setSelectHPLP3065();
        //2.5 Verify the Text "HP LP3065"
        String actualText = desktops.setVerifyTextHPLP3065();
        String expectedText = "HP LP3065";
        Assert.assertEquals(actualText,expectedText,"Display the products is not HP LP3065");
        //2.6 Select Delivery Date "2022-11-30"
        desktops.setSelectDate();
        //2.7.Enter Qty "1” using Select class.
        desktops.setSelectQty();
        //2.8 Click on “Add to Cart” button
        desktops.setSelectAddToCart();
        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String actualMess = desktops.setVerifyTextSuccess();
        String expectedMess = "Success: You have added HP LP3065 to your shopping cart!\n"+
                "×";
        Assert.assertEquals(actualMess,expectedMess,"Success: You have added HP LP3065 to your shopping cart! Not displayed");
        //2.10 Click on link “shopping cart” display into success message
        desktops.setSelectTheCart();
        //2.11 Verify the text "Shopping Cart"
        String actualTxt = desktops.setVerifyTheTextShoppingCart();
        String expectedTxt = "Shopping Cart  (1.00kg)";
        Assert.assertEquals(actualTxt,expectedTxt,"Shopping Cart  (1.00kg) is not displayed");
        //2.12 Verify the Product name "HP LP3065"
        String actualText1 = desktops.setVerifyTheNameHPLP3065();
        String expectedText1 = "HP LP3065";
        Assert.assertEquals(actualText1,expectedText1,"HP LP3065 is not displayed");
        //2.13 Verify the Delivery Date "2023-11-30"
        Thread.sleep(3000);
        String actualMessage1 = desktops.setDeliveryDate();
        String expectedMessage1 = "Delivery Date:2023-11-30";
        Assert.assertEquals(actualMessage1,expectedMessage1);
        //2.14 Verify the Model "Product21"
        String actualText2 = desktops.setVerifyTheProduct21();
        String expectedText2 = "Product 21";
        Assert.assertEquals(actualText2,expectedText2,"Product 21 is not displayed");
        //2.15 Verify the Todat "£74.73"
        //desktops.setSwitchToPound();
        String actualMessage2 = desktops.setVerifyTotalPrice();
        String expectedMessage2 = "$122.00";
        Assert.assertEquals(actualMessage2,expectedMessage2,"$122.00 is not displayed");
    }
}
