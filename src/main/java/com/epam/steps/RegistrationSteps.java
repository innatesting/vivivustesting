package com.epam.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationSteps {
    private WebDriver driver;

    public RegistrationSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInRegistrationDetails(String email, String password) {
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("register-button")).click();
    }

    public void verifyRegistrationCompleted() {
        assert driver.findElement(By.className("ico-logout")).isDisplayed();
    }
}