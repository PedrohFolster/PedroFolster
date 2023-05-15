package exercicio_array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o " + i + "° número: ");
            array[i] = scan.nextInt();

        }
        Arrays.sort(array);
        System.out.println("Valores em ordem: " + Arrays.toString(array));
    }
}
