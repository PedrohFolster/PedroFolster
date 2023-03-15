package faculdadeSenac;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        while(true) {
            System.out.println("\nNúmero:");
            numero = scan.nextInt();

            System.out.println("Tabuada de " + numero + ":");

            for (int i = 0; i <= 10; i = i + 1) {
                System.out.println(numero + " X " + i + " = " + (numero * i));
            }
        }
    }
}
