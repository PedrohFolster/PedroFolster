package procedimentos;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número para verificar se o mesmo é primo ou não: ");
        numero = scan.nextInt();

        if (verificarPrimo(numero)) {
            System.out.println("O número " + numero + " é um número primo!");
        } else {
            System.out.println("O número " + numero + " não é um número primo!");
        }
    }

    private static boolean verificarPrimo(int numero) {

        System.out.println();

        if (numero <= 1) {
            return false;
        } else if (numero % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
