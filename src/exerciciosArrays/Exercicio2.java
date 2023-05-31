package exerciciosArrays;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° nome: ");
            nomes[i] = scan.nextLine();
        }

        System.out.print("Nomes na forma inversa: ");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.print(nomes[i] + " ");
        }
    }
}
