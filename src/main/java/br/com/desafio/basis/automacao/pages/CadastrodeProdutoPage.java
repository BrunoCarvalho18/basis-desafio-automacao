package br.com.desafio.basis.automacao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import br.com.desafio.basis.automacao.core.BasePage;
import br.com.desafio.basis.automacao.core.Driver;

public class CadastrodeProdutoPage extends BasePage {
	
	
	public CadastrodeProdutoPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "inputNome")
	WebElement campoNomeDoProduto;
	
	@FindBy(id = "inputPreco")
	WebElement campoPreco;
	
	@FindBy(id = "inputValidade")
	WebElement campoValidade;
	
	@FindBy(css = "button[class='btn btn-primary']")
	WebElement botaoAdicionar;
	
	

	@FindBy(css = "#conteudoTabela > tr > td:nth-child(2)")
	WebElement conteudoTabelaNomeProduto;
	
	
	
	public WebElement getCampoNomeDoProduto() {
		return campoNomeDoProduto;
	}

	public void setCampoNomeDoProduto(WebElement campoNomeDoProduto) {
		this.campoNomeDoProduto = campoNomeDoProduto;
	}

	public WebElement getCampoPreco() {
		return campoPreco;
	}

	public void setCampoPreco(WebElement campoPreco) {
		this.campoPreco = campoPreco;
	}

	public WebElement getCampoValidade() {
		return campoValidade;
	}

	public void setCampoValidade(WebElement campoValidade) {
		this.campoValidade = campoValidade;
	}

	public WebElement getBotaoAdicionar() {
		return botaoAdicionar;
	}
	
	public void setBotaoAdicionar(WebElement botaoAdicionar) {
		this.botaoAdicionar = botaoAdicionar;
	}

	
	public WebElement getConteudoTabelaNomeProduto() {
		return conteudoTabelaNomeProduto;
	}

	public void setConteudoTabelaNomeProduto(WebElement conteudoTabelaNomeProduto) {
		this.conteudoTabelaNomeProduto = conteudoTabelaNomeProduto;
	}

	

}
