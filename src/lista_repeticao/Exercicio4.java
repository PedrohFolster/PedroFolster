package lista_repeticao;

import exemplos.Saudacao;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Escreva o " + i + "º número: ");
            int numero = scan.nextInt();

            soma += numero;
        }
        System.out.println("A média é de: " + (soma / 10));

    }
}
