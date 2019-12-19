/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium6;

import selenium5.*;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import selenium4.*;
import selenium2.*;
import selenium.*;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    public void seleniumRobot() throws Exception {

        String address = "http://automationpractice.com/index.php";

        driver.get(address);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.getElementById('search_query_top').value='test';");

    }

    @After
    public void close() {
        driver.quit();
    }
}
