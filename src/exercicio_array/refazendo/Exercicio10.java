package exercicio_array.refazendo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            numeros[i] = scan.nextInt();
        }
        System.out.println();

        Arrays.sort(numeros);
        System.out.println("Números na forma crescente: " + Arrays.toString(numeros));
    }
}
