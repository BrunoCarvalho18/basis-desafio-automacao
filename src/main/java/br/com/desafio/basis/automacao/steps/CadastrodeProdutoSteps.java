package br.com.desafio.basis.automacao.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import static br.com.desafio.basis.automacao.core.Driver.getDriver;
import org.junit.Assert;
import br.com.desafio.basis.automacao.functionalities.CadastroProdutoFunctionalities;

public class CadastrodeProdutoSteps {

	String url = "http://localhost:8000/teste-3.html";
	CadastroProdutoFunctionalities cadastroProdutoFunctionalities = new CadastroProdutoFunctionalities();

	@Dado("que eu esteja logado na pagina")
	public void que_eu_esteja_logado_na_pagina() {
		getDriver().get(url);
	}

	@Quando("preencho com os campos {string}  {string}  {string}")
	public void preencho_com_os_campos(String nomeProduto, String preco, String validade) {
		cadastroProdutoFunctionalities.escreverNomeProduto(nomeProduto);
		cadastroProdutoFunctionalities.escreverPreco(preco);
		cadastroProdutoFunctionalities.escreverValidade(validade);
		cadastroProdutoFunctionalities.clicarBotaoAdicionar();

	}

	@Entao("o produto e cadastro com sucesso {string}")
	public void o_produto_e_cadastro_com_sucesso(String nomeProduto) {
		String nomeProdutoWeb = cadastroProdutoFunctionalities.retornarTabelaNome();
		Assert.assertEquals(nomeProdutoWeb, nomeProduto);

	}

	@Entao("o produto nao e cadastrado com sucesso {string} preco invalido")
	public void o_produto_nao_e_cadastrado_com_sucesso_preco_invalido(String precoInvalido) {
		String precoInvalidoWeb = cadastroProdutoFunctionalities.labelPrecoInvalido();
		Assert.assertEquals(precoInvalidoWeb, precoInvalido);
	}
	
	@Entao("o produto nao e cadastrado com sucesso {string} validade invalida")
	public void o_produto_nao_e_cadastrado_com_sucesso_validade_invalida(String validadeInvalida) {
		String validadeInvalidaWeb = cadastroProdutoFunctionalities.labelValidadeInvalida();
		Assert.assertEquals(validadeInvalidaWeb, validadeInvalida);
	}

}
