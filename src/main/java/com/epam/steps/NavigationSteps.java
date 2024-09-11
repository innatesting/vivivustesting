package com.epam.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationSteps {
    private WebDriver driver;

    public NavigationSteps() {
        System.setProperty("webdriver.chrome.driver", "/Users/Inna_Batsalai/Downloads/chromedriver-mac-arm64 2/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void navigateToPage(String pageUrl) {
        driver.get("https://www.demowebshop.tricentis.com/" + pageUrl);
    }
}