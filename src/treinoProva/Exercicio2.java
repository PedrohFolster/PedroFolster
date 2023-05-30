package treinoProva;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número para verificar se é par ou impar: ");
        int numero = scan.nextInt();

        boolean verificar = verificar(numero);

        if (verificar) {
            System.out.println();
            System.out.println("O número " + numero + " é par!");
        } else  {
            System.out.println();
            System.out.println("O número " + numero + " é impar!");
        }
    }
    public static boolean verificar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else
            return false;
    }
}
