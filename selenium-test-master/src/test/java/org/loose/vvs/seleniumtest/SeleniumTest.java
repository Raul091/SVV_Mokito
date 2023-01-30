package org.loose.vvs.seleniumtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SeleniumTest {

    public static final String URL = "http://localhost:8080";
    private WebDriver webDriver;

    private static WebDriverManager webDriverManager;

    @BeforeAll
    static void beforeAll() {
        if (WebDriverManager.chromedriver().getBrowserPath().isPresent()) {
            webDriverManager = WebDriverManager.chromedriver();
            return;
        }
        if (WebDriverManager.firefoxdriver().getBrowserPath().isPresent()) {
            webDriverManager = WebDriverManager.firefoxdriver();
        }
    }

    @BeforeEach
    public void setup() {
        assertNotNull(webDriverManager);
        webDriverManager.setup();
        webDriver = webDriverManager.create();
        webDriver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }
}