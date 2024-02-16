package com.example.testing_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/
public class MainPage {
    @FindBy(xpath = "//*[@data-test-marker='Developer Tools']")
    public WebElement seeDeveloperToolsButton;

    @FindBy(xpath = "//*[@data-test='suggestion-action']")
    public WebElement findYourToolsButton;

    @FindBy(xpath = "//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']")
    public WebElement toolsMenu;

    @FindBy(css = "[data-test='site-header-search-action']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@tabindex='0']")
    public WebElement inputSelectSearch;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
