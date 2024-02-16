    package com.example.testing_login.activos.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = http://localhost:8081
public class TestIA {
    @FindBy(name = "nombre")
    public WebElement txtusuario;

    @FindBy(name = "clave")
    public WebElement txtclave;

    @FindBy(css = "button.btn.btn-sm.btn-primary")
    public WebElement btnLogin;

    public void setUsername(String username) {
        txtusuario.sendKeys(username);
    }

    public void setPassword(String password) {
        txtclave.sendKeys(password);
    }

    public void clickLoginButton() {
        btnLogin.click();
    }

    public void login(String nombre, String password){
        setUsername(nombre);
        setPassword(password);
        clickLoginButton();
    }

    public TestIA(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}