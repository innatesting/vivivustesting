package com.epam.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductSteps {
    private WebDriver driver;

    public ProductSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductGroupSubItems(String groupName, int expectedSubItemsCount) {
        WebElement group = driver.findElement(By.linkText(groupName));
        group.click();
        int actualSubItemsCount = driver.findElements(By.cssSelector("h2 > a")).size();
        assert actualSubItemsCount == expectedSubItemsCount;
    }

    public void addItemToWishlist(String itemName) {
        WebElement item = driver.findElement(By.linkText(itemName));
        item.findElement(By.cssSelector(".add-to-wishlist-button")).click();
    }

    public void verifyItemAddedToWishlist(String itemName) {
        navigateToPage("wishlist");
        assert driver.findElement(By.linkText(itemName)).isDisplayed();
    }

    public void addItemToCart(String itemName) {
        WebElement item = driver.findElement(By.linkText(itemName));
        item.findElement(By.cssSelector(".add-to-cart-button")).click();
    }

    public void removeItemFromCart(String itemName) {
        navigateToPage("cart");
        WebElement item = driver.findElement(By.linkText(itemName));
        item.findElement(By.name("removefromcart")).click();
    }

    public void proceedToCheckout() {
        navigateToPage("cart");
        driver.findElement(By.cssSelector(".checkout-button")).click();
    }

    public void completePurchase() {
        driver.findElement(By.cssSelector(".confirm-order-button")).click();
    }
}