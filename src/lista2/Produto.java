package lista2;/*Implemente uma classe Produto com os seguintes atributos privados:
codigo (int), nome (String), preco (double), estoque (int)
Inclua:
Um construtor que receba os quatro parâmetros
Getters para todos os atributos
Um setter apenas para o preço, que não deve aceitar valores negativos
Um método exibirInfo() que imprime todas as informações do produto
----Questão número 3 da lista 2----*/


public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo,String nome,double preco,int estoque){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
    }

    public void setPreco(double preco){
        if (preco >= 0){
            this.preco = preco;
        }
    }

    public void exibirInfo(){
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);

    }

    public static void main(String[] args){
        Produto produto = new Produto(1,"Mouse",100,10);

        produto.exibirInfo();
    }
}
