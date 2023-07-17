#Author: Bruno Carvalho
#language:pt
#encoding UTF-8

@geral
Funcionalidade: Cadastrar Produto
                Eu como usuario gostaria
                de cadastrar produto

@cadastroproduto
Esquema do Cenario: Cadastro um Produto
       Dado que eu esteja logado na pagina
       Quando preencho com os campos "<nomeProduto>"  "<preco>"  "<validade>"
       Entao o produto e cadastro com sucesso "<nomeProduto>"
      
Exemplos:
|nomeProduto    |preco          |validade     |
|Arroz          | 15            | 01/01/2022  | 
|Oleo           | 15            | 15/01/2022  |


@cadastroproduto
Esquema do Cenario: Cadastro um Produto menor que 0
       Dado que eu esteja logado na pagina
       Quando preencho com os campos "<nomeProduto>"  "<preco>"  "<validade>"
       Entao o produto nao e cadastrado com sucesso "<labelinvalida>" preco invalido
      
Exemplos:
|nomeProduto    |preco          |validade     |labelinvalida     |
|Arroz          | -1            | 01/01/2022  | Preço invalido   | 


@cadastroproduto
Esquema do Cenario: Cadastro um Produto validade invalida
       Dado que eu esteja logado na pagina
       Quando preencho com os campos "<nomeProduto>"  "<preco>"  "<validade>"
       Entao o produto nao e cadastrado com sucesso "<labelinvalida>" validade invalida
      
Exemplos:
|nomeProduto    |preco          |validade     |labelinvalida      |
|Arroz          |15             | 01/mm/yyyy  |Validade Invalida  |

