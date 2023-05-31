package class05.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApp;

public class Task2 {
    //goto https://chercher.tech/practice/frames
//click on check box
//then select bay cat from drop down
//then enter text in text box
    public static void main(String[] args) throws InterruptedException {
        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement DD=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel= new Select(DD);
        sel.selectByValue("babycat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Hello");

    }
}