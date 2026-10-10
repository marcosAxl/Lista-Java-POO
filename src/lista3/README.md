----QUESTÃO 4 ----

Explique a diferença entre um array de tipos primitivos (int[], double[]) e um array de objetos (Aluno[], Produto[]) em Java.
a) Como a memória é alocada em cada caso?
b) Quais cuidados devem ser tomados ao acessar elementos de um array de objetos?

---- RESPOSTAS ----

a)Array de tipos primitivos(int[], double[])
armazena os valores diretamente nas posições do array.

int[] numeros = {1,2,3};

cada posição contem um valor inteiro.

 Array de objetos(Aluno[], Produto[])
armazena referencias que apontam para os objetos.
Os objetos são criados separadamente,geralmente com o operador new

Aluno[] alunos = new Aluno[3];
alunos[0] = new Aluno("Laerte",103);

inicialmente todas as posições contem null.Apenas 0 passa 
a referenciar o objeto Aluno.

b) É necessário verificar se a posição contém um objeto antes de acessar seus atributos ou métodos,
pois ela pode conter null, causando um NullPointerException.
Também é importante verificar se o índice está dentro dos limites do array para evitar 
um ArrayIndexOutOfBoundsException.