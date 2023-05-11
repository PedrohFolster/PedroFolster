package exemplos;

import java.util.Scanner;

public class array4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tamanho;
        int numero;

        System.out.print("Informe o comprimento do array: ");
        tamanho = scan.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira o " + i + "° número do array: ");
            numero = scan.nextInt();
            array[i] = (int) (numero);
        }
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();

        System.out.print("Valores do array: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + ", ");
        }

    }
}
