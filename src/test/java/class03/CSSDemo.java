package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createAccount.click();
 //       because the DOM doesn't have firstName by default
//        it only shows up after click on create new account
//        and the code takes some time to appear in DOM for firstName
//        so, we must add a sleep here
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Nelly");
        WebElement lastName=driver.findElement(By.xpath(""));
        lastName.sendKeys("Banyas");

        driver.quit();
    }

}
