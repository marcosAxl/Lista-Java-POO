package lista2;/*Crie uma classe chamada ContaCorrente com os seguintes atributos privados:
numero (int)
titular (String)
saldo (float)

Implemente os seguintes métodos públicos:
sacar(float valor): subtrai o valor do saldo, se houver saldo suficiente. Não permitindo sacar mais de 10000 por operação.
depositar(float valor): adiciona o valor ao saldo, apenas se o valor for positivo e se não for superir a 10000.
consultarSaldo(): retorna o saldo atual.

Crie também uma classe principal (por exemplo, Main) que:
Leia do teclado os dados iniciais de uma conta (número, titular). O saldo inicial deve ser 0.

Exiba um menu em loop, permitindo que o usuário escolha entre:
Sacar um valor
Depositar um valor
Consultar o saldo
Sair do programa

O menu deve continuar sendo exibido até que o usuário escolha sair. Pode-se reutilizar o código feito em sala.
----Questão número 4 da lista 2----*/

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero,String titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void sacar(float valor){
        if (valor <= 0){
            System.out.println("O valor do saque deve ser positivo");
        }else if (valor > 10000){
            System.out.println("O saque não pode ser maior que R$ 10.000");
        }else if (valor > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso");
        }

    }

    public void depositar(float valor){
        if (valor <= 0){
            System.out.println("O valor deve ser positivo:");
        }else if (valor > 10000){
            System.out.println("O deposito não pode ser maior que R$ 10.000");
        } else {
            saldo = saldo + valor;
            System.out.println("Deposito realizado com sucesso");
        }
    }

    public float consultarSaldo(){
        return saldo;
    }

}
