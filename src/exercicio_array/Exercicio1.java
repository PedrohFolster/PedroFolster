package exercicio_array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Insira o " + (i + 1) + "° nome: ");
            nomes[i] = scan.nextLine();
        }

        System.out.print("Nomes do array: " + Arrays.toString(nomes));

        System.out.println("Inverso: ");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.print(" " + nomes[i] + ", ");
        }
    }
}
