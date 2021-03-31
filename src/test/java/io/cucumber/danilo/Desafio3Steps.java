package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracoes;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;

public class Desafio3Steps{
    @Dado("que ainda continuo no site da Trincentis na aba {string}")
    public void que_ainda_continuo_no_site_da_Trincentis_na_aba(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#enterproductdata")); 
    assertTrue(input.isDisplayed());
    }

    @Dado("escolho em Start Date {string}")
    public void escolho_em_Start_Date(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#startdate"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em Insurance Sum {string}")
    public void digito_em_Insurance_Sum(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#insurancesum>option:nth-child(2)"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Dado("escolho em Merit Rating {string}")
    public void escolho_em_Merit_Rating(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#meritrating>option:nth-child(3)"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Dado("escolho em Damage Insurance {string}")
    public void escolho_em_Damage_Insurance(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#damageinsurance>option:nth-child(2)"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Dado("escolho em Optional Products {string}")
    public void escolho_em_Optional_Products(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#insurance-form>div>section:nth-child(3)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(1)>span"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Dado("seleciono em Courtesy Car {string}")
    public void seleciono_em_Courtesy_Car(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#courtesycar>option:nth-child(3)"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Entao("devo clicar em Next para a aba4")
    public void devo_clicar_em_Next_para_a_aba4() {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#nextselectpriceoption"));
    assertTrue(input.isDisplayed());
    input.click();
    }
}
