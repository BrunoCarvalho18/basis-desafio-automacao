package br.com.desafio.basis.automacao.functionalities;

import br.com.desafio.basis.automacao.pages.CadastrodeProdutoPage;

public class CadastroProdutoFunctionalities {

	private CadastrodeProdutoPage cadastroProdutoPage;

	public CadastroProdutoFunctionalities() {
		cadastroProdutoPage = new CadastrodeProdutoPage();
	}

	public void escreverNomeProduto(String nomeProduto) {
		cadastroProdutoPage.getCampoNomeDoProduto().sendKeys(nomeProduto);
	}

	public void escreverPreco(String preco) {
		cadastroProdutoPage.getCampoPreco().sendKeys(preco);
	}

	public void escreverValidade(String validade) {
		cadastroProdutoPage.getCampoValidade().sendKeys(validade);
	}

	public void clicarBotaoAdicionar() {
		cadastroProdutoPage.getBotaoAdicionar().click();
	}
	
	public String retornarTabelaNome() {
		return cadastroProdutoPage.getConteudoTabelaNomeProduto().getText();
	}

}
