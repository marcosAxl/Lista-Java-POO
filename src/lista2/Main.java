package lista2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome do titular:");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;

        do{
            System.out.println("\n----MENU----");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor do saque");
                    float valorSaque = scanner.nextFloat();

                    conta.sacar(valorSaque);
                    break;

                case 2:
                    System.out.println("Digite o valor do desposito:");
                    float valorDeposito = scanner.nextFloat();

                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    break;

                case 4:
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        }while (opcao != 4);

        scanner.close();
    }
}
