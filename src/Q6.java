/*O código abaixo contém erros de sintaxe e/ou lógica.
 Identifique os erros, explique cada um e reescreva o código corrigido:
 import java.util.Scanner;

public class Contador {
    public static void main(String args) {
    --falta das chaves no string--
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador)
            --falta do ponto e virgula--
            --falta da incrementação do contador--
        }
    }
}


 */

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}

