package LAB8;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class WebApp_Test {
    public WebDriver driver;
    public Actions action;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C://Users//19afr//Documents//PJATK//SEM6//TAU//DRIVERS//edgedriver_win64//msedgedriver.exe");

        driver = new EdgeDriver();
        action = new Actions(driver);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void edgeLimangoTest(){
        driver.get("https://www.limango.pl/");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/header/div/div[2]/div[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div/div/div[6]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/div[6]/div[2]/div/div[1]/article/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div/div/a/div/img[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"Warstwa_1_1557227075713\"]")).click();
    }
    @Test
    public void edgeZalandoTest() throws InterruptedException {
        driver.get("https://www.zalando.pl/");
        WebElement account = driver.findElement(By.xpath("//*[@id=\"z-navicat-header-root\"]/header/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/a"));
        action.moveToElement(account).perform();
        Thread.sleep(1500);
        account.click();
        driver.findElement(By.name("login.email")).sendKeys("testemail123@gmail.com");
        driver.findElement(By.name("login.password")).sendKeys("@tEsTpAsSwOrD12321!");
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div/div[2]/div/form/div[2]/div/div/div/button")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div/div[2]/div/form/div[3]/button")).click();
    }
}
