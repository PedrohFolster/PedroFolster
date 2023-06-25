package exercicio_array.refazendo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[10];
        int busca, counter = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            numeros[i] = scan.nextInt();
        }

        System.out.print("Informe o número a ser buscado: ");
        busca = scan.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (busca == numeros[i]) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("O número " + busca + " não está presente no array!");
        } else {
            System.out.println("O número " + busca + " apareceu " + counter + " vezes no array!");
        }
    }
}
