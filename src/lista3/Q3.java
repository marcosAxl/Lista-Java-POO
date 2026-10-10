package lista3;/*Crie um programa que recebe um valor n e exibe os n primeiros números da série de Fibonacci.
 Exemplo, se o usuário informar o valor 10, deve ser exibidos os valores:
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]*/

import java.util.Scanner;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros: ");
        int n = sc.nextInt();

        int[] fibonacci = new int[n];

        if (n > 0) {
            fibonacci[0] = 0;
        }

        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println(Arrays.toString(fibonacci));

        sc.close();
    }
}
