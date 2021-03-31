package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracoes;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;

public class Desafio1Steps{
    @Dado("que estou no site {string}")
    public void que_estou_no_site(String string) {
    Configuracoes.abrir(string);
    }

    @Dado("seleciono em Make {string}")
    public void seleciono_em_Make(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#make > option:nth-child(5)"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Dado("seleciono em Model {string}")
    public void seleciono_em_Model(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#model > option:nth-child(2)"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Dado("digito em Cylinder Capacity {string}")
    public void digito_em_Cylinder_Capacity(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#cylindercapacity"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em Engine Performance {string}")
    public void digito_em_Engine_Performance(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#engineperformance"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("escolho em Date of Manufacture {string}")
    public void escolho_em_Date_of_Manufacture(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#dateofmanufacture"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em Number of Seats {string}")
    public void digito_em_Number_of_Seats(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#numberofseats > option:nth-child(2)"));
    assertTrue(input.isDisplayed());
    input.click();  
    }

    @Dado("escolho em Right Hand Drive {string}")
    public void escolho_em_Right_Hand_Drive(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#insurance-form>div>section:nth-child(1)>div:nth-child(7)>p>label:nth-child(1)>span"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Dado("seleciono em Number of Seats {string}")
    public void seleciono_em_Number_of_Seats(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Dado("seleciono em Fuel Type {string}")
    public void seleciono_em_Fuel_Type(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#fuel>option:nth-child(2)"));
    assertTrue(input.isDisplayed());
    input.click(); 
    }

    @Dado("digito em Payload {string}")
    public void digito_em_Payload(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#payload"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em Total Weight {string}")
    public void digito_em_Total_Weight(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#totalweight"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em List Price {string}")
    public void digito_em_List_Price(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#listprice"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em License Plate Number {string}")
    public void digito_em_License_Plate_Number(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#licenseplatenumber"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);   
    }

    @Dado("digito em Annual Mileage {string}")
    public void digito_em_Annual_Mileage(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#annualmileage"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string); 
    }

    @Entao("clico em Next para a aba2")
    public void clico_em_Next_para_a_aba2() {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#nextenterinsurantdata"));
    assertTrue(input.isDisplayed());
    input.click();
    }
}