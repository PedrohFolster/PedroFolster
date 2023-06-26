package treinoProva.pratica.procedimentos;

import java.util.Random;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[4][4];
        int somaVertical = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println();
        System.out.println("Imprimindo a matriz original: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            somaVertical += matriz[i][i];
        }

        System.out.println("Valor total da soma da diagonal principal: " + somaVertical);
    }
}
