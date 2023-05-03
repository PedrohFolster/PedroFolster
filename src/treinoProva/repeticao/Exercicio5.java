package treinoProva.repeticao;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira o " + i + "° número: ");
            numero = scan.nextInt();

            if (numero < 0) {
                negativos++;
            }
        }
        System.out.println("Dos 10 números digitados, " + negativos + " são negativos!");
    }
}
