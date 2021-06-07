package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddNewCustomer {
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
    public void TC005(){
        try {
            driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");
            WebElement name = driver.findElement(By.name("name"));
            name.sendKeys("Trinh Van Hieu");
            WebElement gender = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
            gender.click();
            WebElement dob = driver.findElement(By.id("dob"));
            dob.sendKeys("1/6/2000");
            WebElement address = driver.findElement(By.name("addr"));
            address.sendKeys("Đà Nẵng");
            WebElement city = driver.findElement(By.name("city"));
            city.sendKeys("BMT");
            WebElement state = driver.findElement(By.name("state"));
            state.sendKeys("nonsense");

            WebElement pin = driver.findElement(By.name("pinno"));
            pin.sendKeys("123456789");
            WebElement telephone = driver.findElement(By.name("telephoneno"));
            telephone.sendKeys("0123456789");
            WebElement email = driver.findElement(By.name("emailid"));
            email.sendKeys("vanhieu12345@me");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("123456789");
            WebElement submit = driver.findElement(By.name("sub"));
            submit.click();
            AssertJUnit.assertTrue(true);
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }

    }

    @Test
    public void TC006(){
        try{
            driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");

            WebElement name = driver.findElement(By.name("name"));
            name.sendKeys("hieu");
            WebElement gender = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
            gender.click();
            WebElement dob = driver.findElement(By.id("dob"));
            dob.sendKeys("01/07/2000");
            WebElement address = driver.findElement(By.name("addr"));
            address.sendKeys("BMT");
            WebElement city = driver.findElement(By.name("city"));
            city.sendKeys("BMT");
            WebElement state = driver.findElement(By.name("state"));
            state.sendKeys("nonsense");

            WebElement pin = driver.findElement(By.name("pinno"));
            pin.sendKeys("123456789");
            WebElement telephone = driver.findElement(By.name("telephoneno"));
            telephone.sendKeys("0123456789");
            WebElement email = driver.findElement(By.name("emailid"));
            email.sendKeys("vanhieu@me");
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("123456789");
            WebElement submit = driver.findElement(By.name("sub"));
            submit.click();
            AssertJUnit.assertTrue(true);
        }catch(Exception e){
            AssertJUnit.assertTrue(false);
        }

    }

    @Test
    public void TC007(){
        try{
            driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");

            WebElement name = driver.findElement(By.name("name"));
            name.sendKeys("");
            WebElement gender = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
            gender.click();
            WebElement dob = driver.findElement(By.id("dob"));
            dob.sendKeys("");
            WebElement address = driver.findElement(By.name("addr"));
            address.sendKeys("");
            WebElement city = driver.findElement(By.name("city"));
            city.sendKeys("");
            WebElement state = driver.findElement(By.name("state"));
            state.sendKeys("");

            WebElement pin = driver.findElement(By.name("pinno"));
            pin.sendKeys("");
            WebElement telephone = driver.findElement(By.name("telephoneno"));
            telephone.sendKeys("");
            WebElement email = driver.findElement(By.name("emailid"));
            email.sendKeys("");
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("");
            WebElement submit = driver.findElement(By.name("sub"));
            submit.click();
            AssertJUnit.assertTrue(true);
            WebElement mess = driver.findElement(By.id("message"));
            if(mess!=null){
                AssertJUnit.assertTrue(false);
            }
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }
    }
}
