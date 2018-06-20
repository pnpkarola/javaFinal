package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 31.10.17.
 */
public class Tests {
    private WebDriver driver;
    private Login login;
    private final static String URL = "https://book.jetblue.com/B6.auth/login?&service=https://badges.jetblue.com";

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(21310, TimeUnit.SECONDS); //nnn
        driver.get(URL);
    }

    @Test
    public void t0(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void t1(){
        Assert.assertEquals(1,1);
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }


}
