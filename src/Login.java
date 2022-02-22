import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:\\Browser-drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
        driver.findElement(By.name("uid")).sendKeys("mngr366103");
        driver.findElement(By.name("password")).sendKeys("sYrehup");
        driver.findElement(By.name("btnLogin")).click();
        driver.close();
    }
}
