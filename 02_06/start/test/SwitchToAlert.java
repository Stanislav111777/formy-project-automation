import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "\\Users\\stasm\\Desktop\\New folder\\chromedriver1.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertbutton = driver.findElement(By.id("alert-button"));
        alertbutton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();



        driver.quit();
    }
}
