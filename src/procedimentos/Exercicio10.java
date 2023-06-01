package procedimentos;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeros;
        double total = 0;

        System.out.print("Informe quantos números estarão dentro do array: ");
        numeros = scan.nextInt();

        int[] array = new int[numeros];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            array[i] = scan.nextInt();

            total += array[i];
        }

        System.out.println("O maior número presente no array é o número " + receberMaior(array));
        System.out.println("O menor número presente no array é o número " + receberMenor(array));
        System.out.println("A média dos números presentes no array é de: " + mediaPresente(array, total));
    }

    private static double mediaPresente(int[] array, double total) {
        return total / array.length;
    }

    public static int receberMenor(int[] array) {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (menor > array[i]) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static int receberMaior(int[] array) {
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maior < array[i]) {
                maior = array[i];
            }
        }
        return maior;
    }
}
