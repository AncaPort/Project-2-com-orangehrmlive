package testsuite;
/**
 * 4. Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * 1. userShouldNavigateToForgotPasswordPageSuccessfully
     * click on the ‘Forgot your password’ link
     * Verify the text ‘Reset Password’
     */
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        //Verify the text ‘Reset Password’
        String expectedResult = "Reset Password";
        String actualResult = driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText();
        Assert.assertEquals("user not able to reset password", expectedResult, actualResult);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
