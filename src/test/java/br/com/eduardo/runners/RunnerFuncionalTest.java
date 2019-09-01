package br.com.eduardo.runners;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	  //features = "src/test/resources/features/AprenderCucumberSteps.feature",
      //features = "src/test/resources/features/alugar_filme.feature",
	    features = "src/test/resources/features/",
	  //features = "src/test/resources/features/inserir_conta.feature",  
	  //tags = "@esse",  execute apenas o cenario que tiver a tag
	  //tags = {"@tipo1","@tipo2"}, organização: excuta cenario
	    tags = "@funcionais",
	  //tags = "~@ignore", //ignora o cenario que tiver a tag  
		glue = "br.com.eduardo.steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},   // forma de relatório no console
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun= false,  // dryRum=true validação de passos, caso falta ele gera.
		strict = false
		)
public class RunnerFuncionalTest {
	@BeforeClass
	public static void reset() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Eduardo\\Documents\\Softwares & Servidores\\WEBDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://srbarriga.herokuapp.com");
		driver.findElement(By.id("email")).sendKeys("edu.hitman01.eh@gmail.com");
		driver.findElement(By.name("senha")).sendKeys("eduhitman1**");
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}
}
