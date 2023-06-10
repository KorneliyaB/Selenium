package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApp(String URL, String browser){
        switch (browser){
            case"chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
//       maximize the window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(URL);
        //implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static void closeBrowser(){
        if (driver!=null){
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
}