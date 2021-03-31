package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracoes;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;

public class Desafio4Steps{
    @Dado("que permaneco no site da Trincentis na aba {string}")
    public void que_permaneco_no_site_da_Trincentis_na_aba(String string) {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#selectpriceoption")); 
    assertTrue(input.isDisplayed());
    }
    
    @Dado("escolho em Select option Plano Gold")
    public void escolho_em_Select_option_Plano_Gold() {
    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#priceTable>tfoot>tr>th.group>label:nth-child(2)"));
    assertTrue(input.isDisplayed());
    input.click(); 
    }
    
    @Entao("devo clicar em Next para a aba5")
    public void devo_clicar_em_Next_para_a_aba5() throws InterruptedException{
        Thread.sleep(5000);
        WebElement input = Configuracoes.browser.findElement(By.cssSelector("#nextsendquote"));
        assertTrue(input.isDisplayed());
        input.click();   
    }
}