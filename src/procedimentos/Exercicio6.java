package procedimentos;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int[] posicaoMenor = new int[2];

        int menor = receberMenor(matriz, posicaoMenor);

        System.out.println("O menor número da matriz é " + menor + " e está na posição [" + posicaoMenor[0] + "][" + posicaoMenor[1] + "].");

        System.out.println();
        System.out.println("Imprimindo a matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int receberMenor(int[][] matriz, int[] posicaoMenor) {

        Scanner scan = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o número que ficará na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    posicaoMenor[0] = i;
                    posicaoMenor[1] = j;
                }
            }
        }
        System.out.println();
        return menor;
    }
}
