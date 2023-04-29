package treinoProva;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeros;
        int quantidade;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        System.out.print("Informe a quantidade de números a serem lidos: ");
        quantidade = scan.nextInt();

        for (int i = 1; i <= quantidade; i ++) {
            System.out.print("Insira o " + i + "° número:");
            numeros = scan.nextInt();

            if (maior < numeros) {
                maior = numeros;
            }

            if (menor > numeros) {
                menor = numeros;
            }
        }
        System.out.println("O maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);

    }
}
