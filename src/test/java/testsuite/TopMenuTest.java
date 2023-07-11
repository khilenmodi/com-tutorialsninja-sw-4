package testsuite;

import com.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;

public class TopMenuTest extends BaseTest {
    Homepage homepage = new Homepage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homepage.setMouseHoverOnDesktop();
        homepage.setSelectShowAllDesktop();
        homepage.check();
        String actualMessage = homepage.setVerifyTheTextDesktop();
        String expectedMessage = "Desktops";
        Assert.assertEquals(actualMessage, expectedMessage, "Display the message is not Desktop");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homepage.setMouseHoverOnLaptopsAndNotebooks();
        homepage.check1();
        String actualText = homepage.setVerifyTheTextLaptopsAndNoteBooks();
        String expectedText = "Laptops & Notebooks";
        Assert.assertEquals(actualText,expectedText,"Display the message is not laptops&Notebooks");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homepage.setMouseHoverOnComponents();
        homepage.check2();
        String actualText = homepage.setVerifyTheTextComponents();
        String expectedText = "Components";
        Assert.assertEquals(actualText,expectedText,"Display the message is not components");
    }

}
