package lista3;/*Escreva um programa que lê seis números de um jogo da mega-sena e adiciona a um array.
 Os números devem ser de 1 a 60 e não deve ser permitida a inserção de números duplicados.
  Ao fim, exiba os números ordenados em ordem crescente.*/

import java.util.Scanner;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];
        int quantidade = 0;

        System.out.print("Digite seis numeros de 1 a 60: ");

        while (quantidade < 6) {

            int numero = sc.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Numero invalido. Digite entre 1 e 60.");
            } else {
                boolean repetido = false;

                for (int i = 0; i < quantidade; i++) {
                    if (numeros[i] == numero) {
                        repetido = true;
                        break;
                    }
                }

                if (repetido) {
                    System.out.println("Numero ja informado. Digite outro.");
                } else {
                    numeros[quantidade] = numero;
                    quantidade++;
                }
            }
        }

        Arrays.sort(numeros);

        System.out.println("Numeros em ordem crescente:");
        System.out.println(Arrays.toString(numeros));

        sc.close();
    }
}
