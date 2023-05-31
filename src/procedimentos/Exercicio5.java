package procedimentos;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        System.out.println("A soma dos números na vertical principal da matriz é: " + somarVertical(matriz));


        System.out.println();
        System.out.println("Imprimindo a matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int somarVertical(int[][] matriz) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o número que ficará na posição " + "[" + i + "]" + "[" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        System.out.println();
        return soma;
    }
}
