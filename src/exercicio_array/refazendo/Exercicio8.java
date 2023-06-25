package exercicio_array.refazendo;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [][] matrizA = new int[3][3];
        int [][] matrizB = new int[3][3];

        System.out.println("Informe os valores que estarão presentes na matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print("Informe o número que ficará na posição [" + i + "] [" + j + "]: ");
                matrizA[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Informe os valores que estarão presentes na matriz B");

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.print("Informe o número que ficará na posição [" + i + "] [" + j + "]: ");
                matrizB[i][j] = scan.nextInt();
            }
        }
        System.out.println();

        System.out.println("Matriz A original: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Matriz B original: ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Soma da matriz A com a Matriz B: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print((matrizA[i][j] + matrizB[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
