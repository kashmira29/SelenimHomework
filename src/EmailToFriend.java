import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmailToFriend {
    protected static WebDriver driver;

    public static void main(String args[])
        {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDrivers\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximise the window browser screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open the website
        driver.get("https://demo.nopcommerce.com/");
        //login to account
        driver.findElement(By.className("ico-login")).click();
        //enter email
        driver.findElement(By.className("email")).sendKeys("new@test.com");
        //enter password
        driver.findElement(By.id("Password")).sendKeys("test123");
        //click on login
        driver.findElement(By.cssSelector("input.login-button")).click();
        //click on category Computers
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/computers\"]")).click();
        //select notebooks
        //driver.findElement(By.xpath("//h2/a[@href=\"/notebooks\"]")).click();
        driver.findElement(By.linkText("Notebooks")).click();
        //click on Apple pro 13inch
        driver.findElement(By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        //email to friend
        //driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        //driver.findElement(By.className("email-a-friend")).click();
        //driver.findElement(By.cssSelector("div.email-a-friend")).click();
        driver.findElement(By.cssSelector("input.email-a-friend-button")).click();
        //enter friend's email
        driver.findElement(By.className("friend-email")).sendKeys("abcxyz@gmail.com");
        //enter personal message
        driver.findElement(By.id("PersonalMessage")).sendKeys("This is test");
        try {
            Thread.sleep(4000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        //click on submit
        driver.findElement(By.name("send-email")).click();
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
