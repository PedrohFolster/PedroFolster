package exemplos;

import java.util.Scanner;

public class UsandoFor2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int impar = 0, par = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
                par++;
            } else {
                System.out.println(numero + " é ímpar");
                impar++;
            }
        }
        System.out.println("\nDos 50 números digitados, " + par + " são pares e " + impar + " são impar.");
    }
}

