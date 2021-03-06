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
	    tags = "@unitarios",
	  //tags = "~@ignore", //ignora o cenario que tiver a tag  
		glue = "br.com.eduardo.steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},   // forma de relatório no console
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun= false,  // dryRum=true validação de passos, caso falta ele gera.
		strict = false
		)
public class RunnerTest {

}
