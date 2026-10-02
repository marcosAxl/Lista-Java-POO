package lista1;/*Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras.
 Escreva um aplicativo que leia cinco números entre 1 e 30.
 Para cada número que é lido, seu programa deve exibir o mesmo número de asteriscos adjacentes.
 Por exemplo, se seu programa lê o número 7, ele deve exibir *******.
 Exiba as barras dos asteriscos depois de ler os cinco números.
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        System.out.println("Digite os 5 numeros inteiros:");

        for(int i = 0;i < 5;i++){
            numeros[i] = scanner.nextInt();
        }
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < numeros[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
