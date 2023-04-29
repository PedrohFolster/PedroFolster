package treinoProva;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeros;
        int pares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira o " + i + "° número: ");
            numeros = scan.nextInt();

            if (numeros % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Dos 10 números digitados, " + pares + " são pares!");
    }
}
