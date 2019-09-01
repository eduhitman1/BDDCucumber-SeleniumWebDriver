package br.com.eduardo.steps;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class InserirContasSteps {

	private WebDriver driver;
	
	@Dado("^que estou acessando a aplicacao$")
	public void queEstouAcessandoAAplicacao() throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Eduardo\\Documents\\Softwares & Servidores\\WEBDRIVER\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://srbarriga.herokuapp.com");
	}

	@Quando("^informo o usuario \"([^\"]*)\"$")
	public void informoOUsuRio(String arg1) throws Throwable {
	    
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String arg1) throws Throwable {
		driver.findElement(By.name("senha")).sendKeys(arg1);
	}

	@Quando("^seleciono entrar$")
	public void selecionoEntrar() throws Throwable {
		driver.findElement(By.tagName("button")).click();
	//	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
	}

	@Entao("^visualizo a pagina inicial$")
	public void visualizoAPaginaInicial() throws Throwable {
	    
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Bem vindo, Eduardo Henrique Gonçalves Matias!", texto);
		
		
	}

	@Quando("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
	    
	//	driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.linkText("Contas")).click();
	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {
	   
		driver.findElement(By.linkText("Adicionar")).click();
		
		
	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String arg1) throws Throwable {
	    
		driver.findElement(By.name("nome")).sendKeys(arg1);
		
		
	}

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {

		driver.findElement(By.tagName("button")).click();
		
	}

	@Entao("^a conta e inserida com sucesso$")
	public void aContaInseridaComSucesso() throws Throwable {
	    
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", texto);
		
	}
	
	
	@Entao("^sou notificado que o nome da conta e obrigatorio$")
	public void souNotificadoQueONomeDaContaEObrigatorio() throws Throwable {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Informe o nome da conta", texto);
	}
	
	@Entao("^sou notificado que ja existe uma conta com esse nome$")
	public void souNotificadoQueJaExisteUmaContaComEsseNome() throws Throwable {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Já existe uma conta com esse nome!", texto);	
	}
	
	@Entao("^recebo a mensagem \"([^\"]*)\"$")
	public void receboAMensagem(String arg1) throws Throwable {
		String texto = driver.findElement(By.xpath("//div[starts-with(@class, 'alert alert-')]")).getText();
		Assert.assertEquals(arg1, texto);
	}
	
	
	
	
	
	@Before
	public void inicio() {
		System.out.println("Iniciando");
	}
	
	
	
// PRINT DE TELA
	@After(order=1, value= {"@funcionais"}) // VALUE não permite que screenshot execute as feature que tem a tag @unitarios
	public void screenshot(Scenario cenario) {
	File file =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File("target/screenshot/"+cenario.getId()+".jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	
	
	
	
	@After(order = 0, value= {"@funcionais"})
	public void fecharBrowser() {
		driver.quit();
		System.out.println("finalizado");
	}
	
}
