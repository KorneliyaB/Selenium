package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Watchable;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApp;

public class Frames {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);

        // task1: print animal on screen and select Babycat from drop down
// Step1: as the webelement inside an iframe first we need to switch to it
        driver.switchTo().frame(1);
        // find the WebElement animal
        WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
        // select Baby cat
        WebElement dd=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd); //we are using select class for dropdowns, creating obj
        sel.selectByVisibleText("Baby Cat");
// switch the focus to the main page
        driver.switchTo().defaultContent();//using default it always go to the main window
//  switch to frame containing text box
        driver.switchTo().frame("frame1");

        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("abracadabra");

        //click on the checkbox
        //switch to iframe
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();


    }
}
