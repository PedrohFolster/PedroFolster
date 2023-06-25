package exercicio_array.refazendo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] numero = new int[10];
        int busca;

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            numero[i] = scan.nextInt();
        }

        System.out.print("Informe um número para realizar uma busca no array: ");
        busca = scan.nextInt();

        if (Arrays.binarySearch(numero, busca) >= 0) {
            System.out.println("Achei!");
        } else {
            System.out.println("O número não está presente no Array!");
        }
    }
}
