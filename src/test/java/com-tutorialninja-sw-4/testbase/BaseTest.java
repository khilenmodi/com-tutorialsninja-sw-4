package com;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends com.Utility {

        String browser = com.PropertyReader.getInstance().getProperty("browser");

        @BeforeMethod
    public void setUp(){
            selectBrowser(browser);
        }

        @AfterMethod
    public void tearDown(){
            closeBrowser();
        }

}
