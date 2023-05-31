package class04.Homework;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class Task1 extends CommonMethods {
    /*
    goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one
     */
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);
    WebElement dayOfWeek = driver.findElement(By.cssSelector("select[id='select-demo']"));
    Select obj = new Select(dayOfWeek);

    List<String> valuesToSelect = Arrays.asList("Tuesday", "Thursday", "Friday");
        for (String value : valuesToSelect) {
        obj.selectByValue(value);
        Thread.sleep(3000);
    }

        driver.quit();

}
    }

