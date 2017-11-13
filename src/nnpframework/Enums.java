package nnpframework;

import static nnpframework.NnPFramenwork.driver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author
 */
public class Enums {
    BrowserType browser;
    
    public Enums(BrowserType browser){
        this.browser = browser;
    }
    
    public void SelectBrowser(){
        switch (browser){
            case Chrome:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lebogang\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                System.out.println("[INFO] Chrome browser opened successfully");
                break;
            case FireFox:
                System.out.println("[INFO] Firefox browser opened successfully");
                break;
            case IE:
                System.out.println("[INFO] IE browser opened successfully");
                break;
        }
    }
    
}
