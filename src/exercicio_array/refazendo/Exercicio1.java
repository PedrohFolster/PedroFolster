package exercicio_array.refazendo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° nome: ");
            nomes[i] = scan.nextLine();
        }
        System.out.println();
        System.out.println("Nomes na forma normal: " + Arrays.toString(nomes));

        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.print(" " + nomes[i] + ", ");
        }
    }
}
