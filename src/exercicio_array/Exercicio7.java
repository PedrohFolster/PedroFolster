package exercicio_array;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[][] matrizResultado = new int[3][3];
        int multiplicacao;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.print("Digite o número pelo qual você deseja multiplicar a matriz: ");
        multiplicacao = scan.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizResultado[i][j] = matriz[i][j] * multiplicacao;
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz gerada pela multiplicação:");
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
