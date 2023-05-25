package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);
        WebElement createAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createAccount.click();
        Thread.sleep(2000);
        //1.  find the element associate with dropdown
        WebElement days= driver.findElement(By.xpath("//select[@id='day']"));
        //2.create an object of the select class and pass in the parameters the element dropdown
        Select sel=new Select(days);
        // 3. use method provided in select class to select the option that u desire
        sel.selectByVisibleText("8");
        Thread.sleep(2000);
        sel.selectByValue("26");
        Thread.sleep(2000);
        sel.selectByIndex(0);


    }
}
