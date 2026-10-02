package lista1;/*Escreva um programa que leia o nome de um aluno e suas três notas, sendo a terceira nota com peso 2.
 Calcule e exiba a média ponderada, com duas casas decimais. Depois, exiba se o aluno está "Aprovado" (média ≥ 7) ou "Reprovado".
 */

import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite a primeira nota:");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + (n3*2)) / 4;

        if(media >= 7) {
            System.out.println("aprovado\n");
            System.out.printf("Media:%.2f%n",media);
        }   else{
            System.out.println("reprovado\n");
            System.out.printf("Media:%.2f%n",media);
        }
    }
}
