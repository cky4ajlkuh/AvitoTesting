package tasks.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class BaseFirstTest {

    protected WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.avito.ru");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
    public void switchToActiveWindow(WebDriver driver) {
        ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));
    }

}
