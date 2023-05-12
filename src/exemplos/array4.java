package exemplos;

import java.util.Scanner;

public class array4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tamanho;
        int numero;
        int aparecer = 0;
        int verificar;

        System.out.print("Informe o comprimento do array: ");
        tamanho = scan.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira o " + (i + 1) + "° número do array: ");
            numero = scan.nextInt();
            array[i] = (int) (numero);
        }
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();

        System.out.print("Digite um número para verificar quantas vezes ele apareceu no Array: ");
        verificar = scan.nextInt();

        for (int i = 0; i < tamanho; i++) {
            if (verificar == array[i]) {
                aparecer++;
            }
        }

        System.out.println("O número " + verificar + " apareceu " + aparecer + " vezes no array.");
        System.out.println();
        System.out.println("Os números que estão dentro do array são: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
