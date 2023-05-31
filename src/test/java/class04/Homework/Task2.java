package class04.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApp;

public class Task2 {
    /*
    goto facebook.com , click on create account
and select the your  date of birth using select class
     */
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);
        WebElement clickCreateNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        clickCreateNewAccount.click();
        Thread.sleep(2000);

        List<WebElement> dayOfWeek = driver.findElements(By.cssSelector("select[id='month'], select[id='day'], select[id='year']"));
        List<String> valuesToSelect = Arrays.asList("3", "20", "1989");

        for (int i = 0; i < dayOfWeek.size(); i++) {
            Select obj = new Select(dayOfWeek.get(i));
            obj.selectByValue(valuesToSelect.get(i));
            Thread.sleep(1000);
        }

        driver.quit();

    }
}
