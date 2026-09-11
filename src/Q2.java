/*Peça um número ao usuário. Verifique e imprima:
"Múltiplo de 3", se for múltiplo de 3;
"Múltiplo de 5", se for múltiplo de 5;
"Múltiplo de ambos", se for múltiplo de 3 e 5;
"Não é múltiplo de 3 nem de 5", caso contrário.*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int n = scanner.nextInt();

        if(n % 3 == 0&& n % 5 == 0) {
            System.out.println("Multiplo de ambos");
        }else if(n % 3 == 0) {
            System.out.println("Multiplo de 3");
        }else if(n % 5 == 0){
            System.out.println("Multiplo de 5");
        }else{
            System.out.println("Não é multiplo de 3 nem de 5");
        }
    }
}
