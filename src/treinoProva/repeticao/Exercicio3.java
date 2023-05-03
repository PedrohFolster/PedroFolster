package treinoProva.repeticao;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número de 1 a 10 para obter sua tabuada: ");
        numero = scan.nextInt();

        if (numero > 10 || numero < 1) {
            System.out.print("Valor inválido! Insira um número entre 1 e 10: ");
            numero = scan.nextInt();
        }

        System.out.println("Tabuada de " + numero + " :");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

    }
}
