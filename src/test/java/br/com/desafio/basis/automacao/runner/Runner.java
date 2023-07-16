package br.com.desafio.basis.automacao.runner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static br.com.desafio.basis.automacao.core.Driver.getDriver;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.desafio.basis.automacao.steps" }, features = {
		"src/main/resources" },tags =  "@geral")
public class Runner {
	
	
	@AfterClass
	public static void encerraDriver() {
		getDriver().close();
	}

}
