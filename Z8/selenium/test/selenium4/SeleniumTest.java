/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium4;

import selenium2.*;
import selenium.*;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author root
 */
public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void seleniumAction1() throws Exception {
        String address = "http://demo.guru99.com/test/drag_drop.html";

        driver.get(address);

        WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));

        WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

        Actions builder = new Actions(driver);

        builder.dragAndDrop(From, To)
                .perform();

    }

    @Test
    public void seleniumAction2() throws Exception {
        String address = "http://demo.guru99.com/test/drag_drop.html";

        driver.get(address);

        Actions builder = new Actions(driver);

        builder.keyDown(Keys.SHIFT)
                .click(driver.findElement(By.id("item1")))
                .click(driver.findElement(By.id("item10")))
                .keyUp(Keys.SHIFT)
                .dragAndDrop(driver.findElement(By.id("cdk-drop-list-1")), driver.findElement(By.id("cdk-drop-list-2")))
                .perform();

    }

    @After
    public void close() {
        driver.quit();
    }
}
