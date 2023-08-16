package Modulos.login;

import Paginas.LoginPage;
import Paginas.RegisterPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste web do modulo de login")
public class LoginTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){

        //abrir o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        this.navegador = new ChromeDriver();
        //maximizar a tela
        navegador.manage().window().maximize();
        //ir para o site
        navegador.get("https://parabank.parasoft.com/parabank/billpay.htm");
    }


    @Test
    public void testRegistrarUmUsuario(){

        new RegisterPage(navegador)
                .submeterAPaginaDeRegistro()
                .informarFirstName("leonardo")
                .informarLastName("richard")
                .informarAddress("Rua contra mão")
                .informarCity("Natal")
                .informarState("Rio grande do norte")
                .informarZipCode("59123456")
                .informarPhoneNumber("84 99090-1234")
                .informarSsn("123456789")
                .informarUsername("userName")
                .informarPassword("passWord")
                .informarRepeatedPassword("passWord")
                .submeterOFormularioDeRegistroDoUsuario();
    }

    @Test
    @DisplayName("teste fazendo login com usuario cadastrado")
    public void testLoginComUsuarioRegistrado(){

        new LoginPage(navegador)
                .informarUserName("userName")
                .informarPassword("passWord")
                .submeterFormularioDeLoginDoUsuario();
    }

    @AfterEach
    public void afterEach(){
        navegador.quit();
    }

}
