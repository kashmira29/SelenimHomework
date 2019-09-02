import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static javax.print.attribute.standard.MediaSizeName.B;

public class LoginLogoutOrangehrm {
    protected static WebDriver driver;
    public static void main(String args[])
        {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDrivers\\chromedriver.exe");
        //open the browser
        driver =new ChromeDriver();
        //maximise the window browser screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //enter the username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //enter the password
        driver.findElement(By.name("txtPassword")).sendKeys( "admin123");
        //click on login;
        driver.findElement(By.id("btnLogin")).click();
        //dropdown arrow
        driver.findElement(By.className("panelTrigger")).click();
        //click on logout
        driver.findElement(By.linkText("Logout")).click();
        //pause
        try {
            Thread.sleep(4000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");

        }
        //close the window
        driver.close();
        }
}
