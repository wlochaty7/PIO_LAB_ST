/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium3;

import selenium2.*;
import selenium.*;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void selenium() throws Exception {
        String address = "http://automationpractice.com/index.php";

        driver.get(address);

        WebElement loginButton = driver.findElement(By.className("login"));
        loginButton.click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginOnPage("selenium@wp.pl", "abcABC");

        WebElement userLink = driver.findElement(By.linkText("Sele nium"));

        assertTrue(userLink.isDisplayed());

    }

    @After
    public void close() {
        driver.quit();
    }
}
