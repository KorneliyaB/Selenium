package review03;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actionDragAndDrop extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);
        // draggable and droppable elements
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action=new Actions(driver);
        // in order to drop an element from one location to another
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
    }
}
