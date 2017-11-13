package nnpframework;

import static nnpframework.NnPFramenwork.driver;
import static nnpframework.NnPFramenwork.wait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author
 */

public class SeleniumUtility {
  
    //navigates to URL
    public boolean navigateToPage(String url){
        driver.navigate().to(url);
        driver.manage().window().maximize();
        return true;
    }
    //pause method
    public boolean pause(int seconds){
        wait = new WebDriverWait(driver, seconds);
        return true;
    }
    //find element by xpath
    public boolean findElementByXpath(String xpath){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath));
        return true;
    }
    //find element by xpath - visibility of element
    public boolean waitForElementByXpath(String xpath, int seconds){
        wait = new WebDriverWait(driver, seconds);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        return true;
    }
    //find element by xpath - element to be clickable
    public boolean waitForElementToBeClickableByXpath(String xpath, int seconds){
        wait = new WebDriverWait(driver, seconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        return true;
    }
    //Close browser
    public boolean close(){
        driver.quit();
        return true;
    }
    
    
}
