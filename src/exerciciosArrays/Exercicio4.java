package exerciciosArrays;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[5];
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número do array: ");
            array[i] = scan.nextInt();

            if (maior < array[i]) {
                maior = array[i];
            }
        }
        System.out.println();
        System.out.println("O maior número presente no array é: " + maior);
    }
}
