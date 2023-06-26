package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Informe o número que ficará na posição [" + i + "] [" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Imprimindo a matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Somando a diagonal da matriz: ");

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        System.out.println(soma);
    }
}
