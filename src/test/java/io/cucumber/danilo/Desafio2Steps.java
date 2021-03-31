package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracoes;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;

public class Desafio2Steps{
    @Dado("que continuo no site da Trincentis na aba {string}")
    public void que_continuo_no_site_da_Trincentis_na_aba(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#enterinsurantdata")); 
    assertTrue(input.isDisplayed());
    }

    @Dado("digito em First Name {string}")
    public void digito_em_First_Name(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#firstname"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em Last Name {string}")
    public void digito_em_Last_Name(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#lastname"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }  

    @Dado("escolho em Date of Birth {string}")
    public void escolho_em_Date_of_Birth(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#birthdate"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("escolho em Gender {string}")
    public void escolho_em_Gender(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#insurance-form>div>section:nth-child(2)>div:nth-child(4)>p>label:nth-child(2)>span"));
    assertTrue(input.isDisplayed());
    input.click();  
    }

    @Dado("digito em Street Adress {string}")
    public void digito_em_Street_Adress(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#streetaddress"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("escolho em Contry {string}")
    public void escolho_em_Contry(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#country>option:nth-child(32)"));
    assertTrue(input.isDisplayed());
    input.click(); 
    }

    @Dado("digito em Zip Code {string}")
    public void digito_em_Zip_Code(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#zipcode"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("digito em City {string}")
    public void digito_em_City(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#city"));
    assertTrue(input.isDisplayed());
    input.sendKeys(string);
    }

    @Dado("seleciono em Occupation {string}")
    public void seleciono_em_Occupation(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#occupation>option:nth-child(2)"));
    assertTrue(input.isDisplayed());
    input.click(); 
    }

    @Dado("clico em Hobbies em {string}")
    public void clico_em_Hobbies_em(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5) > span"));
    assertTrue(input.isDisplayed());
    input.click(); 
    }

    @Dado("informo em Website {string}")
    public void informo_em_Website(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#website"));
    assertTrue(input.isDisplayed());
    input.click();
    }

    @Entao("devo clicar em Next para a aba3")
    public void devo_clicar_em_Next_para_a_aba3() {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#nextenterproductdata"));
    assertTrue(input.isDisplayed());
    input.click();
    }
}