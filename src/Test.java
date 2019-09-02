import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    protected static WebDriver driver;

    public static void main(String args[]){
       System.setProperty("webdriver.chrome.driver","src\\BrowserDrivers\\chromedriver.exe");
       //open the browser
        driver =new ChromeDriver();
        //maximise the window browser screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //open the website
        driver.get("https://demo.nopcommerce.com/");
        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter first name
        driver.findElement(By.id("FirstName")).sendKeys("venus");
        //enter last name
        driver.findElement(By.id("LastName")).sendKeys("patel");
        //enter email
        driver.findElement(By.name("Email")).sendKeys("krp@gmail.com");
        //enter password
        driver.findElement(By.id("Password")).sendKeys("test123");
        //re-enter same password to confirm
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
        //click on register
        driver.findElement(By.name("register-button")).click();
        //pause
        try {
            Thread.sleep(4000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");

        }
        driver.close();



    }

}
