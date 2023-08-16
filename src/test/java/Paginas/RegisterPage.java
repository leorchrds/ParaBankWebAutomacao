package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver navegador;

    public RegisterPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public RegisterPage submeterAPaginaDeRegistro(){
        navegador.findElement(By.linkText("Register")).click();
        return this;
    }

    public RegisterPage informarFirstName(String firstName){
        navegador.findElement(By.id("customer.firstName")).sendKeys(firstName);
        return this;
    }
    public RegisterPage informarLastName(String lastName){
        navegador.findElement(By.id("customer.lastName")).sendKeys(lastName);
        return this;
    }
    public RegisterPage informarAddress(String address){
        navegador.findElement(By.id("customer.address.street")).sendKeys(address);
        return this;
    }
    public RegisterPage informarCity(String city){
        navegador.findElement(By.id("customer.address.city")).sendKeys(city);
        return this;
    }
    public RegisterPage informarState(String state){
        navegador.findElement(By.id("customer.address.state")).sendKeys(state);
        return this;
    }
    public RegisterPage informarZipCode(String zipCode){
        navegador.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
        return this;
    }
    public RegisterPage informarPhoneNumber(String phoneNumber){
        navegador.findElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
        return this;
    }
    public RegisterPage informarSsn(String ssn){
        navegador.findElement(By.id("customer.ssn")).sendKeys(ssn);
        return this;
    }
    public RegisterPage informarUsername(String userName){
        navegador.findElement(By.id("customer.username")).sendKeys(userName);
        return this;
    }
    public RegisterPage informarPassword(String password){
        navegador.findElement(By.id("customer.password")).sendKeys(password);
        return this;
    }
    public RegisterPage informarRepeatedPassword(String repeatedPassword){
        navegador.findElement(By.id("repeatedPassword")).sendKeys(repeatedPassword);
        return this;
    }

    public LoginPage submeterOFormularioDeRegistroDoUsuario(){
        navegador.findElement(By.cssSelector("input[value='Register']")).click();
        return new LoginPage(navegador);
    }







}
