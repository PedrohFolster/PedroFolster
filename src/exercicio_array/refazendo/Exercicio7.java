package exercicio_array.refazendo;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int multiplicador;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Informe o número da posição " + "[" + i + "]" + "[" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.print("Informe um número para multiplicar a matriz: ");
        multiplicador = scan.nextInt();

        System.out.println();
        System.out.println("Matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matriz resultado: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print((matriz[i][j] * multiplicador) + " ");
            }
            System.out.println();
        }
    }
}
