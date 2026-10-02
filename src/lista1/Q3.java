package lista1;/*Peça ao usuário um número inteiro positivo N. Em seguida, imprima todos os números primos entre 2 e N.*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo");
        int n = scanner.nextInt();

        for(int i = 2;i <= n; i++){
            boolean primo = true;

            for(int divisor = 2;divisor < i;divisor++){
                if(i % divisor == 0){
                    primo = false;
                    break;
                }
            }if (primo){
                System.out.println(i);

            }
        }
    }
}
