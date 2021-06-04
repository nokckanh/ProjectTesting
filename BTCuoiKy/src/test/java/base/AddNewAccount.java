package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddNewAccount {
    private WebDriver driver;
    @BeforeClass
    public void BrowserOpen() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
//        driver.manage().window().maximize();
    }
    @BeforeClass
    public void LoginTest() {

        WebElement username = driver.findElement(By.name("uid"));
        username.sendKeys("mngr330797");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("hUtahUm");
        WebElement login = driver.findElement(By.name("btnLogin"));
        login.submit();
    }
    @Test
    public void AddNewAccount(){
        WebElement newAccount = driver.findElement(By.xpath("//a[contains(text(),'New Account')]"));
        newAccount.click();
        WebElement customerId= driver.findElement(By.name("cusid"));
        customerId.sendKeys("30246");
        WebElement type = driver.findElement(By.xpath("//option[contains(text(),'Current')]"));
        type.click();
        WebElement deposit=  driver.findElement(By.name("inideposit"));
        deposit.sendKeys("1000000");
        WebElement submit = driver.findElement(By.name("button2"));
        submit.click();
    }
}
