import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "\\Users\\stasm\\Desktop\\New folder\\chromedriver1.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
        fileUpload.sendKeys("file-to-upload.png");

        driver.quit();
    }
}
