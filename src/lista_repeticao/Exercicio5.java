package lista_repeticao;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeros;
        int negativo = 0;

        System.out.println("Insira 10 números para saber se algum deles é negativo!");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira agora o " + i + "º número: ");
            numeros = scan.nextInt();
            System.out.println(i + "º número: " + numeros);

            if (numeros < 0) {
                negativo++;
                System.out.println("Você tem " + negativo + " numero(s) negativos!");
            }
        }
    }
}
