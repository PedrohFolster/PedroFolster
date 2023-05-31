package procedimentos;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];

        System.out.println("Há " + receberPares(matriz) + " números pares!");


        System.out.println();
        System.out.println("Imprimindo a matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int receberPares(int[][] matriz) {

        Scanner scan = new Scanner(System.in);

        int par = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o número que ficará na posição " + "[" + i + "]" + "[" + j + "]: ");
                matriz[i][j] = scan.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    par++;
                }
            }
        }
        System.out.println();
        return par;
    }
}
