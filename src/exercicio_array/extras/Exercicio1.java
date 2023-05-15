package exercicio_array.extras;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] quartos = new int[10];
        int counter = 0;
        int totalQuartos = 0;

        for (int i = 0; i < quartos.length; i++) {
            System.out.print("Informe quantos quartos tem no " + (i + 1) + "° apartamento: ");
            quartos[i] = scan.nextInt();

            totalQuartos += quartos[i];

            if (quartos[i] > 3) {
                counter++;
            }
        }
        System.out.println("Há " + totalQuartos + " quartos em 10 apartamentos!");
        System.out.println("Há " + counter + " de apartamentos com 3 quartos.");
    }
}
