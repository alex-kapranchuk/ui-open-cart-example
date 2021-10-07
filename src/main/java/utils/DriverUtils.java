package utils;

import driver.DriverRepository;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverUtils {

    private WebDriver driver;


    public DriverUtils() {
        driver = DriverRepository.DRIVERS.get();
    }

    public void clickOnElementJS(WebElement element) {
        getJSExecutor().executeScript("arguments[0].click();", element);
    }

    private JavascriptExecutor getJSExecutor() {
        return (JavascriptExecutor) driver;
    }

    public WebDriverWait getDriverWait(long waitValueInSeconds) {
        return (WebDriverWait) new WebDriverWait(DriverRepository.DRIVERS.get(), waitValueInSeconds)
                .pollingEvery(Duration.ofSeconds(1));

    }


}
