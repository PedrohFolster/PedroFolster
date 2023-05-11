package exemplos;

import java.util.Scanner;

public class ArrayRandom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tamanho;

        System.out.print("Informe o comprimento do array: ");
        tamanho = scan.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.print("Valores do array: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + ", ");
        }

    }
}