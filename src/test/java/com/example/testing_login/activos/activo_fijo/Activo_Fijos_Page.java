package com.example.testing_login.activos.activo_fijo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

// page_url = http://localhost:8081/activos/activos-fijos
public class Activo_Fijos_Page {
    @FindBy(xpath = "//*[@id='nuevo-activo-fijo']")
    public WebElement buttonNuevoActivoFijo;

    @FindBy(id = "#select2-categoriaContableId-q1-container")
    public WebElement selectoption;
    @FindBy(xpath = "//*[@id='categoriaContableId']")
    public List<WebElement> categoriaOptions;
    
    //2. Entrar al buscador
    /*@FindBy(xpath = "//*[@id='page-top']/div[2]/span/span/span[1]/input")
    public WebElement searchCC;*/
    @FindBy(xpath = "//*[@id='select2-categoriaContableId-2a-container']")
    public WebElement searchCC;

    //3. Iterar entre las listas
    @FindBy(xpath = "//*[@id='select2-categoriaContableId-6s-results']")
    public WebElement leerCC;

    @FindBy(xpath = "//*[@id='nuevo-activo-fijo']")
    public WebElement buttonNuevoActivoFijo2;

    @FindBy(css = "[data-select2-id = '429']")
    public WebElement spanSeleccione;


    @FindBy(css = "span.select2.select2-container.select2-container--bootstrap4.select2-container--above.select2-container--focus")
    public WebElement spanSeleccione4;

    @FindBy(xpath = "//*[text() = '--Seleccione--']")
    public WebElement spanSeleccione5;

    @FindBy(css = "span.select2.select2-container.select2-container--bootstrap4.select2-container--above.select2-container--focus.select2-container--open")
    public WebElement spanSeleccione2;


    @FindBy(css = "select[data-select2-id='428']")
    public WebElement selectCategoriaContable2;

    @FindBy(css = "select.form-control.form-control-sm.select2.select2-hidden-accessible")
    public WebElement selectCategoriaContable3;

/*
    //Modelo (marca)
    //1. Dar click
    @FindBy(id = "select2-categoriaContableId-6s-container")
    public WebElement clickCC;

    //2. Entrar al buscador
    @FindBy(xpath = "//*[@id='page-top']/div[2]/span/span/span[1]/input")
    public WebElement searchCC;

    //3. Iterar entre las listas
    @FindBy(xpath = "//*[@id='select2-categoriaContableId-6s-results']")
    public WebElement leerCC;

    //Subcategoria(categoria)
    @FindBy(xpath = "//a[@href='/select2-modeloId-hv-results/']/li")
    public WebElement s2Modelo;

    @FindBy(xpath = "//a[@href='\select2-subcategoriaId-u7-results/']/li")
    public WebElement s2Subcategoria;

    @FindBy(css = "input[tabindex='0']")
    public WebElement inputSelectSearch2;
*/
    public Activo_Fijos_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}