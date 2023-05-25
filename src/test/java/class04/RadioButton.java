package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);

        //radiobutton
        WebElement radioB=driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        radioB.click();
        //check if radioB is selected
        boolean radioBisSelected=radioB.isSelected();
        System.out.println("the radio button Male is selected :"+radioBisSelected);
        //check if displayed
        boolean radioBisDisplayed=radioB.isSelected();
        System.out.println("the radio button Male is displayed :"+radioBisDisplayed);

        // check if enabled
        boolean radioBisEnabled = radioB.isEnabled();
        System.out.println("the radio button Male is enabled :"+radioBisEnabled);

        // diselect male to
        WebElement rb2=driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        rb2.click();

        radioBisSelected=radioB.isSelected();
        System.out.println("the male radio button is selected :"+radioBisSelected);


    }
}