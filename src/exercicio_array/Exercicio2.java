package exercicio_array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int busca, encontrado = 0;

        int[] numero = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            numero[i] = scan.nextInt();
        }

        System.out.println("Digite um número para busca: ");
        busca = scan.nextInt();

        if (Arrays.binarySearch(numero, busca) >= 0) {
            System.out.println("Achei!");
        } else {
            System.out.println("Não achei!");
        }
    }
}
