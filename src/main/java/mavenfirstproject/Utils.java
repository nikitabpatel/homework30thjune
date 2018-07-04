package mavenfirstproject;

import mavenfirstproject.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends Basepage {
    public static void ClickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void EnterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String GetTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // unable to use this method in thesuit. I tried lots but it keeps giving me error and does not able to find locator when i use this.
    public static void waitForElementToBeSelected(By by, int time) {
      WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeSelected(by));}

        // Have not use this method in my test but gamita said to make reusable method to be clickable so i include that homework here.
    public static void waitForElementToBeClickable(By by, int time)
    { WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));}

    public static void SelectFromDropdown(String dropdown, String chooseValue)
    { Select droplist = new Select(driver.findElement(By.name(dropdown)));
        droplist.selectByVisibleText(chooseValue);
    }

    public static void SelectFromDropList(String droplist, int chooseValue)
    { Select list = new Select(driver.findElement(By.id(droplist)));
    list.selectByIndex(chooseValue);
    }


    }

