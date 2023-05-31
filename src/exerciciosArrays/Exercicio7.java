package exerciciosArrays;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] cores = new String[4];

        for (int i = 0; i < cores.length; i++) {
            System.out.print("Digite a cor " + (i + 1) + ": ");
            cores[i] = scan.nextLine();
        }

        boolean encontrouVermelho = false;

        for (String cor : cores) {
            if (cor.equalsIgnoreCase("vermelho")) {
                encontrouVermelho = true;
                break;
            }
        }

        if (encontrouVermelho) {
            System.out.println("A cor 'vermelho' está presente no array.");
        } else {
            System.out.println("A cor 'vermelho' não está presente no array.");
        }
    }
}
