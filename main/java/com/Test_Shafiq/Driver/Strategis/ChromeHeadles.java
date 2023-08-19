package com.Test_Shafiq.Driver.Strategis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadles {

    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");

        return new ChromeDriver(options);
    }

}
