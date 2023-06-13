package class07.Homework;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement pimBtn=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();
        List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td[2]"));


        for (int i = 0; i < tableRows.size(); i++) {
            var textElement = tableRows.get(i).getText();
            if (textElement.equals("53695A")) {
                System.out.println("The row number is " + (i + 1));
                System.out.println(textElement);

    }
}
    }
}
/*
 HW:
goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
login
click on PIM
from the table choose any ID
and print out the row number of that id
please make sure that ur code is dynamic enough to cater if another row gets
deleted , it still prints the row correctly
 */
