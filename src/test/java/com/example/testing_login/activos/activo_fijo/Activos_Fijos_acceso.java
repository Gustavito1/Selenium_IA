package com.example.testing_login.activos.activo_fijo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = http://localhost:8081/menu
public class Activos_Fijos_acceso {
    @FindBy(xpath = "//a[@href='#collapseActivos']")
    public WebElement CollapseActivo_fijo;
    @FindBy(xpath = "//a[@href='/activos/activos-fijos']")
    public WebElement Activo_fijo;

    public Activos_Fijos_acceso(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}