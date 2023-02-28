import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;




public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "\\Users\\stasm\\Desktop\\New folder\\chromedriver1.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();




        driver.quit();
    }
}
