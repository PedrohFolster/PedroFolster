package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorMenorUmaDuzia = 1.3;
        double valorUmaDuzia = 1;
        int macasCompradas;

        System.out.println("Insira o número de maças compradas: ");
        macasCompradas = scan.nextInt();
        if (macasCompradas >= 12) {
            System.out.println("O valor total foi de: " + macasCompradas * valorUmaDuzia);
        } else {
            System.out.println("O valor total foi de: " + macasCompradas * valorMenorUmaDuzia);
        }
    }
}
