package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */
public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * 1. userSholdLoginSuccessfullyWithValidCredentials
     * *  Enter “Admin” username
     * *  Enter “admin123 password
     * *  Click on ‘LOGIN’ button
     * *  Verify the ‘Dashboard’ text is display
     */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “Admin” username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        //Enter “admin123 password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        //Verify the ‘Dashboard’ text is display
        String expectedResult = "Dashboard";
        String actualResult = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        Assert.assertEquals("user not able to login successfully", expectedResult, actualResult);

    }
@After
    public void tearDown(){
        closeBrowser();
}
}
