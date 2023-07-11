package testsuite;

import com.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccounts;

public class MyAccountsTest extends BaseTest {

    MyAccounts myAccounts = new MyAccounts();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //1.1 Click on My Account Link.
        myAccounts.setClickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccounts.selectMyAccountOption("Register");
        //1.3 Verify the text “Register Account”.
        String actualMessage = myAccounts.setVerifyTheTextRegisterAccount();
        String expectedMessage = "Register Account";
        Assert.assertEquals(actualMessage,expectedMessage,"Register Account is not Displayed");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //2.1 Click on My Account Link.
        myAccounts.setClickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccounts.selectMyAccountOption("Login");
        //2.3 Verify the text “Returning Customer”.
        String actualMessage = myAccounts.setVerifyTextReturningCustomer();
        String expectedMessage = "Returning Customer";
        Assert.assertEquals(actualMessage,expectedMessage,"Returning Customer is not Displayed");
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        //3.1 Click on My Account Link.
        myAccounts.setClickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccounts.selectMyAccountOption("Register");
        //3.3 Enter First Name
        myAccounts.setFirstName();
        //3.4 Enter Last Name
        myAccounts.setLastName();
        //3.5 Enter Email
        myAccounts.setEMail();
        //3.6 Enter Telephone
        myAccounts.setTelephone();
        //3.7 Enter Password
        myAccounts.setPassword();
        //3.8 Enter Password Confirm
        myAccounts.setPasswordConfirm();
        //3.9 Select Subscribe Yes radio button
        myAccounts.setSelectRadioButton();
        //3.10 Click on Privacy Policy check box
        myAccounts.setPrivacyPolicy();
        //3.11 Click on Continue button
        myAccounts.setClickContinue();
        //3.12 Verify the message “Your Account Has Been Created!”
        String actualMessage = myAccounts.setVerifyTextMessage();
        String expectedMessage =  "Your Account Has Been Created!";
        Assert.assertEquals(actualMessage,expectedMessage,"Your Account Has Been Created! is not displayed");
        //3.13 Click on Continue button
        myAccounts.setClickingContinue();
        //3.14 Click on My Account Link.
        myAccounts.setClickOnMyAccountLink();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccounts.setClickOnLogOut();
        //3.16 Verify the text “Account Logout”
        String actualText = myAccounts.setVerifyTheTextAccountLogOut();
        String expectedText = "Account Logout";
        Assert.assertEquals(actualText,expectedText,"Account Logout is not displayed");
        //3.17 Click on Continue button
        myAccounts.setContinueToClick();
    }
        @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        //4.1 Click on My Account Link.
            myAccounts.setClickOnMyAccountLink();
            // 4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
            myAccounts.selectMyAccountOption("Login");
            //4.3 Enter Email address
            myAccounts.setEMail();
            //4.4 Enter Last Name
           // myAccounts.setLastName();
            //4.5 Enter Password
            myAccounts.setPassword();
            //4.6 Click on Login button
            myAccounts.setClickOnLogin();
            //4.7 Verify text “My Account”
            String actualText = myAccounts.setVerifyTextMyAccount();
            String expectedText = "My Account";
            Assert.assertEquals(actualText,expectedText,"My Account is not displayed");
            //4.8 Click on My Account Link.
            myAccounts.setClickOnMyAccountLink();
            //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
            myAccounts.selectMyAccountOption("Logout");
            //4.10 Verify the text “Account Logout”
            String actualText1 = myAccounts.setVerifyTheTextAccountLogOut();
            String expectedText1 = "Account Logout";
            Assert.assertEquals(actualText1,expectedText1,"Account Logout is not displayed");
            //4.11 Click on Continue button
            myAccounts.setContinueToClick();
        }
}
