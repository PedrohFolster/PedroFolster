package procedimentos;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número do array: ");
            array[i] = scan.nextInt();
        }

        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Forma crescente dos números pares: " + (Arrays.toString(formaCrescentePares(array))));
        System.out.println("Forma crescente dos números ímpares: " + (Arrays.toString(formaCrescenteImpares(array))));

    }

    public static int[] formaCrescenteImpares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                Arrays.sort(array);
            }
        }
        return array;
    }

    public static int[] formaCrescentePares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                Arrays.sort(array);
            }
        }
        return array;
    }
}
