package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracoes;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;

public class Desafio5Steps{

    @Dado("que eu ainda permaneco no site da Trincentis na aba {string}")
    public void que_eu_ainda_permaneco_no_site_da_Trincentis_na_aba(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#sendquote")); 
    assertTrue(input.isDisplayed());
    }

    @Dado("digito em E-mail {string}")
    public void digito_em_E_mail(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#email"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em Phone {string}")
    public void digito_em_Phone(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#phone"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em Username {string}")
    public void digito_em_Username(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#username"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em Password {string}")
    public void digito_em_Password(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#password"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em Confirm Password {string}")
    public void digito_em_Confirm_Password(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#confirmpassword"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("escrevo em Comments {string}")
    public void escrevo_em_Comments(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#Comments"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("clico em Send")
    public void clico_em_Send() {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#sendemail"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Entao("devo visualizar {string}")
    public void devo_visualizar(String string) throws InterruptedException{
    Thread.sleep(9000);
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("h2"));
    assertTrue(input.isDisplayed());
    Configuracoes.fechar();    
    }
}