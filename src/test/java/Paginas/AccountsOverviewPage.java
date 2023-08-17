package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsOverviewPage {
    private WebDriver navegador;

    public AccountsOverviewPage (WebDriver navegador){
        this.navegador = navegador;
    }

    public String capturarMensagem(){
        return navegador.findElement(By.cssSelector("h1[class='title']")).getText();
    }
}
