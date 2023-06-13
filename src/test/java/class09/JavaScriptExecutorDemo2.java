package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com/";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        // perform scroll operation
        //using java script
        JavascriptExecutor js=(JavascriptExecutor) driver;
//scroll down
        js.executeScript("window.scrollBy(0, 500)");
//        Thread.sleep for observation
        Thread.sleep(3000);
//        scroll up
        js.executeScript("window.scrollBy(0,-500)");
//      click on he dropdown "All"
        //use click from jsExecutor
        WebElement all=driver.findElement(By.xpath("//div/select[@id='searchDropdownBox']"));
        js.executeScript("arguments[0].click();",all);








    }
}
