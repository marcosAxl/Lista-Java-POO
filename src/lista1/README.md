Questão 5:

O Scanner é utilizado em Java para receber dados digitados pelo usuário.
Para usar ele é necessário importar a classe Scanner e criar um objeto para realizar a leitura.
Para ler um número decimal é so usar o método nextDouble().

O System.out.printf é utilizado para formatar a saída dos dados. 

EXEMPLO:

import java.util.Scanner;

public class Q5 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero decimal:");
        double numero = scanner.nextDouble();

        System.out.printf("Numero: %.2f", numero);
    }
}
