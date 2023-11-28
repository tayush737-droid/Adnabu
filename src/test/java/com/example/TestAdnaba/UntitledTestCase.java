package com.example.TestAdnaba;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://adnabu-arjun.myshopify.com/");
    driver.findElement(By.linkText("14k Solid Bloom Earrings")).click();
    driver.findElement(By.name("add")).click();
    driver.findElement(By.id("updates_large_40428607504481:51921c980d6c838a41ceefae4bc0971e")).clear();
    driver.findElement(By.id("updates_large_40428607504481:51921c980d6c838a41ceefae4bc0971e")).sendKeys("2");
    driver.findElement(By.id("updates_large_40428607504481:51921c980d6c838a41ceefae4bc0971e")).click();
    driver.findElement(By.id("updates_large_40428607504481:51921c980d6c838a41ceefae4bc0971e")).clear();
    driver.findElement(By.id("updates_large_40428607504481:51921c980d6c838a41ceefae4bc0971e")).sendKeys("3");
    driver.findElement(By.id("updates_large_40428607504481:51921c980d6c838a41ceefae4bc0971e")).click();
    driver.findElement(By.linkText("Remove")).click();
    driver.findElement(By.linkText("Continue shopping")).click();
    driver.findElement(By.xpath("//ul[@id='SiteNav']/li[2]/a/span")).click();
    driver.findElement(By.linkText("14k Dangling Pendant Earrings")).click();
    driver.findElement(By.xpath("//form[@id='product_form_6876454551649']/div[3]/button/span")).click();
    driver.findElement(By.name("checkout")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Log in'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//input[@name='update']")).click();
    driver.findElement(By.xpath("//ul[@id='SiteNav']/li/a/span")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
