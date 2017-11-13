/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnpframework;

 //* @author 
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

 //*//
public class NnPFramenwork {
    public static WebDriver driver;
    public static Actions action;
    public static WebElement webElement;
    public static WebDriverWait wait;
    public static SeleniumUtility Selenium = new SeleniumUtility();
    public static PageObjects pageObject = new PageObjects();
    public static Enums browser = new Enums(BrowserType.Chrome);
    
    public static String URL;
    
    public static void main(String[] args) throws InterruptedException, IOException
    {
        System.out.println("[INFO] Launching Chrome Browser");
        browser.SelectBrowser();
        URL = "https://www.facebook.com/";
        Selenium.navigateToPage(URL);
        captureScreenshot("HomePage");


        
        
        Selenium.close();
    }
    
    //Screenshot function
    public static void captureScreenshot(String name)
    {
        try
        {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("C:/selenium/NnPFrameWork/" + name + ".png"));
        }
        catch (IOException ex)
        {
            System.out.println("[ERROR] Failed to capture screenshot: " + ex.getMessage());
        }
    }

    
}
