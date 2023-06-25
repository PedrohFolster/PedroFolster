package exercicio_array.refazendo;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [][] matriz = new int[4][4];
        int menorNumero = Integer.MAX_VALUE;
        int menorPosicao = -1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Informe o número que ficará na posição [" + i + "] [" + j + "]: ");
                matriz[i][j] = scan.nextInt();
                }
            }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < menorNumero) {
                    menorNumero = matriz[i][j];
                    menorPosicao = matriz[i][j];
                }
            }
        }

            System.out.println();

            System.out.println("O menor valor da matriz é: " + menorNumero + " e está na posição " + menorPosicao);

    }
}
