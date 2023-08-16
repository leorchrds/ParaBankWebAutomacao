package Paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginPage informarUserName(String userName){
        navegador.findElement(By.cssSelector("input[name='username']")).sendKeys(userName);
        return this;
    }

    public LoginPage informarPassword(String password){
        navegador.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;
    }

    public AccountsOverviewPage submeterFormularioDeLoginDoUsuario(){
        navegador.findElement(By.cssSelector("input[value='Log In']")).click();
        return new AccountsOverviewPage(navegador);
    }
}
