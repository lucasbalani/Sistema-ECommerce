# API Pensada no desafio da Supera

Desde já, peço desculpas ao simples projeto, é um projeto simples que voce tem como cadastrar
um produto em uma lista atraves do metodo POST atraves do PostMan, e essa lista será retornada quando for chamada uma
requisição GET, foi utilizado o "H2 Database" como DB, o codigo está incompleto, com um bug na hora de calcular o preço total dos produtos
e o frete, que tentei resolver mas nao tive êxito, o motivo do atraso da entrega foi por isso; O motivo do projeto estar bem simples é que eu me deparei com java EE,
como sou estudante da área e estou começando agora, ainda estou no pacote JAVA SE, entao tive algumas dificuldades para lidar
com algumas bibliotecas, diante do prazo estipulado pela empresa estudei e dei o meu melhor e consegui fazer este projeto bem simples.

#End - Points

#/carrinho
- Quando feita a requisição GET utilizando PostMan, retorna a lista de produtos cadastrado ali no carrinho;
- Quando feita a requisição POST, passando um JSON com os atributos do objeto Produto, adiciona o Produto na lista chamada pela requisição GET.

#End - Points (BUG)

#/carrinho/checkout
- Erro ao tentar instanciar uma Classe, da erro interno e interrompe o TomCat;
