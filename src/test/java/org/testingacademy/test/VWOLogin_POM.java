package org.testingacademy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testingacademy.pages.pageObjectModel.LoginPage_POM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWOLogin_POM {
    @Test
    public void testLoginNegativeVWO() {
        WebDriver driver = new EdgeDriver();
        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds("admin@gmail.com", "abcd");

        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Test
    public void testLoginNegativeVWO_1() {
        WebDriver driver = new ChromeDriver();
        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds("rakeshr@gmail.com", "bbbb");

        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Test
    public void testLoginNegativeVWO_2() {
        WebDriver driver = new ChromeDriver();
        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds("manoj@gmail.com", "cccc");

        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
        driver.quit();
    }
}
