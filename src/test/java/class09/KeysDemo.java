package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KeysDemo extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);
        WebElement userNAme=driver.findElement(By.id("ctl00_MainContent_username"));
        userNAme.sendKeys("Tester", Keys.TAB);
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test",Keys.ENTER);
    }
}
