import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected String startUrl = "http://www.quefilo.com/";

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(startUrl);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }

}
