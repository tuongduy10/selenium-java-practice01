import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class SignInCase {
    public static void main(String[] args) {
        try
        {
            WebDriver driver;
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.get("https://penguin-qa.demoapp.info/auth/login?retUrl=%252F");
            driver.manage().window().maximize();
            Thread.sleep(1000);

            WebElement signInElm = driver.findElement(By.xpath("//button[@class=\"btn-5 ant-btn ant-btn-primary ant-btn-round ant-btn-lg\"]"));
            signInElm.click();
            Thread.sleep(1000);

            WebElement usernameElm = driver.findElement(By.xpath("//input[@formcontrolname=\"username\"]"));
            usernameElm.sendKeys("admin");
            Thread.sleep(1000);
            WebElement passwordElm = driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]"));
            passwordElm.sendKeys("12345678@");
            Thread.sleep(1000);

            WebElement loginElm = driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-primary ant-btn-round\"]"));
            loginElm.click();
            Thread.sleep(1000);

            String selectTwElmXpath = "//a[@title=\"Taiwan\"]";
            WebElement selectTwElm = driver.findElement(By.xpath(""));
            selectTwElm.click();
            Thread.sleep(1000);
        }
        catch (Exception error){
            System.out.println(error.toString());
        }
    }
}
