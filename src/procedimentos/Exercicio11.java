package procedimentos;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] array = new int[10];
        int escolha;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            array[i] = scan.nextInt();
        }

        System.out.println("Você quer que o programa apresente os números em qual das formas a seguir? \n" +
                "1 - Forma crescente. \n" +
                "2 - Forma decrescente");
        escolha = scan.nextInt();

        if (escolha == 1) {
            System.out.println("A forma crescente do array é: " + Arrays.toString(formaCrescente(array)));
        } else if (escolha == 2) {
            System.out.println("A forma decrescente do array é: " + Arrays.toString(formaDecrescente(array)));
        } else {
            System.out.println("Erro! Essa opção não existe!");
        }
    }

    public static int[] formaDecrescente(int[] array) {
        Arrays.sort(array);
        int[] arrayDecrescente = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayDecrescente[i] = array[array.length - 1 - i];
        }

        return arrayDecrescente;
    }

    public static int[] formaCrescente(int[] array) {
        Arrays.sort(array);

        return array;
    }
}
