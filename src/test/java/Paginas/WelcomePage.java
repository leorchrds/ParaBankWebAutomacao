package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    private WebDriver navegador;

    public WelcomePage (WebDriver navegador){
        this.navegador = navegador;
    }

    public String capturarMensagem(){
        return navegador.findElement(By.xpath("//p[text()=\"Your account was created successfully. You are now logged in.\"]")) .getText();
    }


}
