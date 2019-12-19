/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

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
    public void selenium() throws Exception {
        String address = "https://translate.google.pl";
        String textToTranslate = "Can I help you";
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get(address);

        if (textToTranslate.trim().length() > 1) {
            WebElement searchField = driver.findElement(By.id("source"));
            searchField.clear();
            searchField.sendKeys(textToTranslate);

            WebElement firstResult = wait.until(presenceOfElementLocated(By.className("translation")));

            System.out.println(firstResult.getText());
        }
    }

    @After
    public void close() {
        driver.quit();
    }
}
