package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);
//as the element in iframe so we need to switch focus
        driver.switchTo().frame(0);
        //find the draggable webelement
        WebElement draggable=driver.findElement(By.id("draggable"));

        WebElement droppable=driver.findElement(By.id("droppable"));
        Actions action =new Actions(driver);
        action.dragAndDrop(draggable,droppable).perform();
    }
}