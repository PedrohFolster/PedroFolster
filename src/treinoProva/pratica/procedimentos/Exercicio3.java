package treinoProva.pratica.procedimentos;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidade;

        System.out.print("Informe a quantidade de números que estarão presentes no array: ");
        quantidade = scan.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            numeros[i] = scan.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println("Números na forma crescente: " + Arrays.toString(numeros));

        System.out.println();

        int[] formaDecrescente = new int[quantidade];
        for (int i = 0; i < numeros.length; i++) {
            formaDecrescente[i] = numeros[numeros.length - 1 - i];
        }
        System.out.println("Números na forma decrescente: " + Arrays.toString(formaDecrescente));
    }
}
