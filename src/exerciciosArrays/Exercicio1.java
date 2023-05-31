package exerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] numeros = new int[5];
        int totalNumeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o " + (i + 1) + "° número: ");
            numeros[i] = scan.nextInt();

            totalNumeros += numeros[i];
        }

        System.out.println();
        System.out.println("Números digitados pelo usuário: " + Arrays.toString(numeros));
        System.out.println("Soma dos números: " + totalNumeros);
    }
}
