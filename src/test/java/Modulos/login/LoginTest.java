package Modulos.login;
import Paginas.LoginPage;
import Paginas.RegisterPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste web do modulo de login")
public class LoginTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        this.navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("https://parabank.parasoft.com/parabank/billpay.htm");
    }

    @Test
    public void testRegistrarUmUsuario(){

       String capturarMensagem = new RegisterPage(navegador)
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
                .submeterOFormularioDeRegistroDoUsuario()
                .capturarMensagem();

       Assertions.assertEquals("Your account was created successfully. You are now logged in." ,capturarMensagem);
    }

    @Test
    @DisplayName("teste fazendo login com usuario cadastrado")
    public void testLoginComUsuarioRegistrado(){
       String capturarMensagem = new LoginPage(navegador)
                .informarUserName("userName")
                .informarPassword("passWord")
                .submeterFormularioDeLoginDoUsuario()
                .capturarMensagem();

        Assertions.assertEquals("Accounts Overview",capturarMensagem );

    }

    @AfterEach
    public void afterEach(){
        navegador.quit();
    }

}
