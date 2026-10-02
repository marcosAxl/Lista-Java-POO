Respostas

1. Getters e Setters

É uma boa prática usar getters e setters porque eles permitem controlar o acesso aos atributos de uma classe.
Assim, os atributos não precisam ficar públicos e qualquer parte do programa pode alterar seus valores sem nenhum controle.

Exemplo, vou ter um atributo idade e usar um setter para impedir que seja cadastrada uma idade negativa.

public void setIdade(int idade) {
   if (idade >= 0) {
     this.idade = idade;
   }
}

Assim, o setter verifica o valor antes de alterar o atributo, ajudando a manter a integridade dos dados do objeto.


2. Sistema de Controle de Biblioteca

A-->Informações relevantes para representar um livro:

>Título
>Autor
>Ano de publicação
>Editora
>Disponibilidade

B-->Por que a classe livro é uma abstração?

A classe livro é uma abstração porque representa,dentro do programa,características e comportamentos que um livro possui na vida real.
O livro possui título,autor etc.No programa,essas características podem ser representadas como atributos da classe Livro.
Logo,a classe representa apenas as informações importantes para o sistema,sem precisar representar todos os detalhes de um livro real.

C-->Metodos da classe Livro:

>emprestar()
>devolver()
>verficarDisponibilidade()