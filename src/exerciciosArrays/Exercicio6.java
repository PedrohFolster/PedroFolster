package exerciciosArrays;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        Random random = new Random();
        int somaValores = 0;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + " ");

                somaValores += matriz[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Soma dos valores da matriz: " + somaValores);
    }
}